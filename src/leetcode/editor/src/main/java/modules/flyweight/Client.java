package modules.flyweight;

public class Client {
    public static void main(String[] args) {
        int ext = 22;
        FlyWeightFactory flyWeightFactory = new FlyWeightFactory();
        FlyWeight flyWeightX = flyWeightFactory.getFlyWeight("X");
        flyWeightX.operate(--ext);
        FlyWeight flyWeightY = flyWeightFactory.getFlyWeight("Y");
        flyWeightY.operate(--ext);
        FlyWeight flyWeightZ = flyWeightFactory.getFlyWeight("Z");
        flyWeightZ.operate(--ext);
        FlyWeight unsharedFlyWeight = new UnsharedConcreteFlyWeight();
        unsharedFlyWeight.operate(--ext);
    }
}