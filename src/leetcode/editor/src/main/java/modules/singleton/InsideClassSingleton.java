package modules.singleton;

/**
 * @author lixiao
 * @version 1.0
 * @date 2020/6/3 15:02
 */
public class InsideClassSingleton {
    private InsideClassSingleton(){

    }
    private static class SingletonHoler {
        /**
         * 静态初始化器，由JVM来保证线程安全
         */
        private static InsideClassSingleton instance = new InsideClassSingleton();
    }
    public static InsideClassSingleton getInstance(){
        return SingletonHoler.instance;
    }

}
