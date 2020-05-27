package com.oilchem.connectionpool.pool;

/**
 * @author lixiao
 * @version 1.0
 * @date 2020/4/29 10:25
 */
public interface IMyPool {
    MyPooledConnection getPooledConnection();
    void createPooledConnection(int count);
}
