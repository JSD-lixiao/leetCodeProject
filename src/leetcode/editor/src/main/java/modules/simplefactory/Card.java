package modules.simplefactory;

/**
 * @author lixiao
 * @version 1.0
 * @date 2020/4/27 16:19
 */
public class Card implements Strategy {
    @Override
    public void pay() {
        System.out.println("pay by card....");
    }
}
