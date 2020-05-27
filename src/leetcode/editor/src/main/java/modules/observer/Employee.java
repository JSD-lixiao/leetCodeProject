package modules.observer;

/**
 * @author lixiao
 * @version 1.0
 * @date 2020/5/22 9:59
 */
public class Employee extends Observer{
    @Override
    public void update() {
        System.out.println("老板来了，继续工作。。。。。");
    }
}
