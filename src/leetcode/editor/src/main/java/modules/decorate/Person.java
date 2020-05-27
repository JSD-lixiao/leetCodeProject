package modules.decorate;

/**
 * @author lixiao
 * @version 1.0
 * @date 2020/4/27 16:57
 */
public class Person {
    private String name;

    public Person() {
    }

    Person(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("name = " + name);
    }
}
