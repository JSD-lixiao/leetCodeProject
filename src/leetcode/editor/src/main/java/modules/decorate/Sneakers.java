package modules.decorate;

/**
 * @author lixiao
 * @version 1.0
 * @date 2020/4/27 16:59
 */
public class Sneakers extends Finery {

    @Override
    public void show() {
        System.out.println("Sneakers");
        this.person.show();
    }
}
