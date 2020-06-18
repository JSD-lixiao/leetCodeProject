package modules.visitor;

/**
 * @author lixiao
 * @version 1.0
 * @date 2020/6/18 8:56
 */
public class ConcreteVisitor1 implements Visitor{
    @Override
    public void visitConcreteElementA(ConcreteElementA concreteElementA) {
        System.out.println(String.format("%s被%s访问",concreteElementA.getClass().getName(),this.getClass().getName()));
    }

    @Override
    public void visitConcreteElementB(ConcreteElementB concreteElementB) {
        System.out.println(String.format("%s被%s访问",concreteElementB.getClass().getName(),this.getClass().getName()));
    }
}
