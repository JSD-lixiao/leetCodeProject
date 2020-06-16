package modules.singleton;

/**
 * 单例模式
 * @author lixiao
 * @version 1.0
 * @date 2020/6/3 14:21
 */
public class Client {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
    }
}
