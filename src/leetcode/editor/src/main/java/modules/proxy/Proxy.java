package modules.proxy;

/**
 * @author lixiao
 * @version 1.0
 * @date 2020/4/28 11:25
 */
public class Proxy implements IGiveGift {

    private Persuit persuit;

    public Proxy(Girl girl) {
        persuit = new Persuit(girl);
    }

    @Override
    public void giveFlowers() {
        persuit.giveFlowers();
    }

    @Override
    public void giveDolls() {
        persuit.giveDolls();
    }

    @Override
    public void giveChocolate() {
        persuit.giveChocolate();
    }
}
