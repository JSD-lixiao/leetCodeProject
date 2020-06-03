package modules.singleton;

/**
 * @author lixiao
 * @version 1.0
 * @date 2020/6/3 14:57
 */
public class SyncSingleton {
    private static SyncSingleton instance;

    private SyncSingleton() {

    }

    public static SyncSingleton getInstance() {
        if (instance == null) {
            synchronized (SyncSingleton.class) {
                if (instance == null) {
                    instance = new SyncSingleton();
                }
            }
        }
        return instance;
    }


}
