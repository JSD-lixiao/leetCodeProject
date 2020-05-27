package modules.proxy;

/**
 * @author lixiao
 * @version 1.0
 * @date 2020/4/28 11:22
 */
class Persuit implements IGiveGift {

    private Girl girl;

    Persuit(Girl girl) {
        this.girl = girl;
    }

    public void setGirl(Girl girl) {
        this.girl = girl;
    }

    public Girl getGirl() {
        return girl;
    }

    @Override
    public void giveFlowers() {
        System.out.println("psersuit Give Flowers");
    }

    @Override
    public void giveDolls() {
        System.out.println("persuit give Dolls");
    }

    @Override
    public void giveChocolate() {
        System.out.println("persuit give chocolate");
    }
}
