package modules.simplefactory;

/**
 * @author lixiao
 * @version 1.0
 * @date 2020/4/27 16:17
 */
public class Cash implements Strategy {

    @Override
    public void pay() {
        System.out.println("pay by cash....");
    }
}
