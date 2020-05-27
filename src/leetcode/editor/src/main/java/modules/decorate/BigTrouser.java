package modules.decorate;

/**
 * @author lixiao
 * @version 1.0
 * @date 2020/4/27 16:59
 */
public class BigTrouser extends Finery {

    @Override
    public void show() {
        System.out.println("BigTrouser");
        this.person.show();
    }
}
