package modules.standarfactory;

/**
 * @author lixiao
 * @version 1.0
 * @date 2020/4/28 13:51
 */
public class ToilsFactory implements IFactory {
    @Override
    public Product createProduct() {
        return new Toils();
    }
}
