package com.oilchem.connectionpool.pool;

import java.sql.*;

/**
 * @author lixiao
 * @version 1.0
 * @date 2020/4/29 10:27
 */
public class MyPooledConnection {

    private Connection connection;
    private Boolean isBusy;


    public MyPooledConnection(Connection connection, Boolean isBusy) {
        this.connection = connection;
        this.isBusy = isBusy;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public Boolean isBusy() {
        return isBusy;
    }

    public Boolean isNotBusy() {
        return !isBusy();
    }

    public void setBusy(Boolean busy) {
        isBusy = busy;
    }

    public void close() {
        this.isBusy = false;
    }

    public ResultSet query(String sql) {
        Statement statement;
        ResultSet resultSet = null;
        try {
            statement = this.connection.createStatement();
            resultSet = statement.executeQuery(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultSet;
    }

}
