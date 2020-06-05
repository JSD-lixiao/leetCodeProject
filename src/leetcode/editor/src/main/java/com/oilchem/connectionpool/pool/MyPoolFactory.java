package com.oilchem.connectionpool.pool;

/**
 * @author lixiao
 * @version 1.0
 * @date 2020/4/29 11:17
 */
public class MyPoolFactory {

    private MyPoolFactory() {
    }

    public static class CreatePool {
        static IMyPool myPool = new MyDefaultPool();
    }

    public static IMyPool getInstance() {
        return CreatePool.myPool;
    }
}
