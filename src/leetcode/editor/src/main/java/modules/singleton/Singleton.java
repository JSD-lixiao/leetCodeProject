package modules.singleton;

/**
 * 普通单例模式，饱汉式
 * @author lixiao
 * @version 1.0
 * @date 2020/6/3 14:42
 */
public class Singleton {
    private static Singleton singleton;
    private Singleton(){

    }
    public static Singleton getInstance(){
        if (singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
