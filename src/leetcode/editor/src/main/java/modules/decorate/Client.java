package modules.decorate;


/**
 * @author lixiao
 * @version 1.0
 * @decription 装饰器模式客户端
 * @date 2020/4/28 10:52
 */
public class Client {

    public static void main(String[] args) {
        Person person = new Person("tom");
        TShirt tShirt = new TShirt();
        Sneakers sneakers = new Sneakers();
        BigTrouser bigTrouser = new BigTrouser();
        bigTrouser.decorate(person);
        sneakers.decorate(bigTrouser);
        tShirt.decorate(sneakers);
        tShirt.show();
    }
}
