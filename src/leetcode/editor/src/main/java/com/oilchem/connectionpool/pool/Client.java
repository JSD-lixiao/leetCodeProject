package com.oilchem.connectionpool.pool;

import java.util.concurrent.*;

/**
 * @author lixiao
 * @version 1.0
 * @date 2020/4/29 11:19
 */
public class Client {

    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                100,
                200,
                200,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(100),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());

       for (int i = 1; i <= 100; i++) {
           threadPoolExecutor.execute(new QueryTest());
        }
    }
}
