package modules.observer;

/**
 * 观察者模式
 * @author lixiao
 * @version 1.0
 * @date 2020/5/16 9:10
 */
public class Client {

    public static void main(String[] args) {
        Subject secretary = new Secretary();
        Observer employee = new Employee();
        Observer workers = new Workers();
        secretary.attch(employee);
        secretary.attch(workers);
        secretary.notifyObservers();
    }
}
