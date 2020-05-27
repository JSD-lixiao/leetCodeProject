package modules.builder;

/**
 * @author lixiao
 * @version 1.0
 * @date 2020/5/16 9:03
 */
public class ConcreteBuilder extends Builder{

    private Product product = new Product();
    @Override
    void buildPartA() {
        product.addPart("部件A");
    }

    @Override
    void buildPartB() {
        product.addPart("部件B");
    }

    @Override
    Product getResult() {
        return product;
    }
}
