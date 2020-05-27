package modules.builder;

/**
 * @author lixiao
 * @version 1.0
 * @date 2020/5/16 8:21
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        ConcreteBuilder concreteBuilder = new ConcreteBuilder();
        director.build(concreteBuilder);
        Product product = concreteBuilder.getResult();
        product.show();

        ConcreteBuilder2 concreteBuilder2 = new ConcreteBuilder2();
        director.build(concreteBuilder2);
        Product product1 = concreteBuilder2.getResult();
        product1.show();
    }
}
