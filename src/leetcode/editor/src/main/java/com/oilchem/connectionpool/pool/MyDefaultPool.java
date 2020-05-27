package com.oilchem.connectionpool.pool;

import com.oilchem.connectionpool.pool.config.DBConfigXML;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;

/**
 * @author lixiao
 * @version 1.0
 * @date 2020/4/29 10:26
 */
public class MyDefaultPool implements IMyPool {

    private Vector<MyPooledConnection> myPooledConnectionVector = new Vector<>();
    private static String url;
    private static String jdbcDriver;
    private static String username;
    private static String password;
    private static Integer initCount;
    private static Integer step;
    private static Integer maxCount;

    MyDefaultPool() {
        init();
        try {
            Class.forName(jdbcDriver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        createPooledConnection(initCount);
        System.out.println("初始化后连接池大小："+myPooledConnectionVector.size());
    }

    private void init() {
        url = DBConfigXML.URL;
        jdbcDriver = DBConfigXML.JDBC_DRIVER;
        username = DBConfigXML.USERNAME;
        password = DBConfigXML.PASSWORD;
        initCount = DBConfigXML.INIT_COUNT;
        step = DBConfigXML.STEP;
        maxCount = DBConfigXML.MAX_COUNT;
    }

    @Override
    public MyPooledConnection getPooledConnection() {
        if (myPooledConnectionVector.size() < 1) {
            throw new RuntimeException("连接池初始化失败");
        }
        MyPooledConnection myPooledConnection ;
        try {
            myPooledConnection = getRealConnection();
            while (myPooledConnection == null ) {
                createPooledConnection(step);
                myPooledConnection = getRealConnection();
            }
            return myPooledConnection;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void createPooledConnection(int count) {
        if (myPooledConnectionVector.size() > maxCount || myPooledConnectionVector.size() + count > maxCount) {
            throw new RuntimeException("连接池已满");
        }
        for (int i = 0; i < count; i++) {
            try {
                Connection connection = DriverManager.getConnection(url, username, password);
                MyPooledConnection myPooledConnection = new MyPooledConnection(connection, false);
                myPooledConnectionVector.add(myPooledConnection);
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }
    private synchronized MyPooledConnection getRealConnection() throws SQLException {
        for (MyPooledConnection myPooledConnection : myPooledConnectionVector) {
            if (myPooledConnection.isNotBusy()) {
                if (myPooledConnection.getConnection().isValid(3000)) {
                    myPooledConnection.setBusy(true);
                    return myPooledConnection;
                }else{
                    Connection connection = DriverManager.getConnection(url, username, password);
                    myPooledConnection.setConnection(connection);
                    myPooledConnection.setBusy(true);
                    return myPooledConnection;
                }
            }
        }
        return null;
    }

}
