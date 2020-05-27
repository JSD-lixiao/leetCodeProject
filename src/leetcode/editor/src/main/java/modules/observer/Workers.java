package modules.observer;

/**
 * @author lixiao
 * @version 1.0
 * @date 2020/5/22 10:00
 */
public class Workers extends Observer{
    @Override
    public void update() {
        System.out.println("老板来了，不能喝酒");
    }
}
