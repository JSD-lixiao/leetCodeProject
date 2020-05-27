package modules.decorate;

/**
 * @author lixiao
 * @version 1.0
 * @date 2020/4/28 10:45
 */
public class Finery extends Person {
    protected Person person;

    public void decorate(Person person) {
        this.person = person;
    }


}
