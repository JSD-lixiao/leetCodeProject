package modules.visitor;

/**
 * @author lixiao
 * @version 1.0
 * @date 2020/6/18 8:47
 */
public class ConcreteElementA implements Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementA(this);
    }
}
