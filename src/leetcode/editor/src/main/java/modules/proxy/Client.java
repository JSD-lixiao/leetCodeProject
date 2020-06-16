package modules.proxy;

/**
 * 代理模式
 * @author lixiao
 * @version 1.0
 * @description 代理模式客户端
 * @date 2020/4/28 11:28
 */
public class Client {
    public static void main(String[] args) {
        Girl girl = new Girl("范冰冰");
        Proxy proxy = new Proxy(girl);
        proxy.giveDolls();
        proxy.giveChocolate();
        proxy.giveFlowers();
    }
}
