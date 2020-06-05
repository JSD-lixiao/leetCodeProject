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
        try (MyPooledConnection myPooledConnection = myPool.getPooledConnection()){
            myPooledConnection.query("select * from basedata_organization limit 10");
            System.out.println("当前线程："+Thread.currentThread().getName()+"使用管道："+myPooledConnection.getConnection());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
