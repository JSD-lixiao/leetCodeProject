package modules.simplefactory;


import modules.simplefactory.enums.PayEnums;

/**
 * @author lixiao
 * @version 1.0
 * @description 简单工厂模式客户端
 * @date 2020/4/28 15:23
 */
public class Client {
    public static void main(String[] args) throws Exception {
        Integer value = 3;
        PayEnums payEnums = PayEnums.getEnums(value);
        Strategy payStrategy = PayFacotry.getStrategy(payEnums.getClassName());
        payStrategy.pay();
    }
}
