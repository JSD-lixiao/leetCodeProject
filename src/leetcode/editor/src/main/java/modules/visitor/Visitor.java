package modules.visitor;

/**
 * 访问者接口，适用于稳定的数据结构，即有限的被访问者个数
 * @author lixiao
 * @version 1.0
 * @date 2020/6/18 8:45
 */
public interface Visitor {
    void visitConcreteElementA(ConcreteElementA concreteElementA);
    void visitConcreteElementB(ConcreteElementB concreteElementB);
}
