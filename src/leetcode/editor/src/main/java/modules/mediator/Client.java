package modules.mediator;

/**
 * @author lixiao
 * @version 1.0
 * @date 2020/6/9 10:20
 */
public class Client {
    public static void main(String[] args) {
        ConcreteMediator concreteMediator = new ConcreteMediator();
        ConcreteCollegue1 concreteCollegue1 = new ConcreteCollegue1(concreteMediator);
        ConcreteCollegue2 concreteCollegue2 = new ConcreteCollegue2(concreteMediator);
        concreteMediator.setConcreteCollegue1(concreteCollegue1);
        concreteMediator.setConcreteCollegue2(concreteCollegue2);
        concreteCollegue1.send("吃过饭了吗");
        concreteCollegue2.send("没呢,你打算请客?");

    }
}
