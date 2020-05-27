package com.oilchem.connectionpool.pool;

import java.sql.ResultSet;

/**
 * @author lixiao
 * @version 1.0
 * @date 2020/4/29 11:55
 */
public class QueryTest implements Runnable {
    public static final IMyPool myPool = MyPoolFactory.getInstance();

    @Override
    public void run() {
        MyPooledConnection myPooledConnection = myPool.getPooledConnection();
        ResultSet resultSet = myPooledConnection.query("select * from basedata_organization limit 10");
        try {
            while (resultSet.next()) {
                System.out.println(resultSet.getString("name") + ","
                        + resultSet.getString("code") +
                        ",使用管道：" + myPooledConnection.getConnection());
            }
            myPooledConnection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
