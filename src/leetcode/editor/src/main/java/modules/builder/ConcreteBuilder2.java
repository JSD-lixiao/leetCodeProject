package modules.builder;

/**
 * @author lixiao
 * @version 1.0
 * @date 2020/5/16 9:04
 */
public class ConcreteBuilder2 extends Builder{
    private Product product = new Product();
    @Override
    void buildPartA() {
        product.addPart("部件X");
    }

    @Override
    void buildPartB() {
        product.addPart("部件Y");
    }

    @Override
    Product getResult() {
        return product;
    }
}
