package modules.standarfactory;

/**
 * 标准工厂模式
 * @author lixiao
 * @version 1.0
 * @description 工厂模式客户端
 * @date 2020/4/28 13:53
 */
public class Client {
    public static void main(String[] args) {
        IFactory iFactory = new ToilsFactory();
        Product product = iFactory.createProduct();
        System.out.println("product = " + product);
        IFactory iFactory1 = new GunsFactory();
        Product product1 = iFactory1.createProduct();
        System.out.println("product1 = " + product1);
    }
}
