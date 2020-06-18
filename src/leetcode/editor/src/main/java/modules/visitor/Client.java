package modules.visitor;

/**
 * 访问者模式
 * @author lixiao
 * @version 1.0
 * @date 2020/6/18 8:43
 */
public class Client {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(new ConcreteElementA());
        objectStructure.attach(new ConcreteElementB());
        ConcreteVisitor1 concreteVisitor1 = new ConcreteVisitor1();
        ConcreteVisitor2 concreteVisitor2 = new ConcreteVisitor2();
        objectStructure.accept(concreteVisitor1);
        objectStructure.accept(concreteVisitor2);
    }
}
