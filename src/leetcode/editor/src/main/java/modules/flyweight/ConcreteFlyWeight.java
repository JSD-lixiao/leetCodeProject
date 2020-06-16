package modules.flyweight;

/**
 * @author lixiao
 * @version 1.0
 * @date 2020/6/16 9:23
 */
public class ConcreteFlyWeight extends FlyWeight{
    @Override
    public void operate(int extrinsicstate) {
        System.out.println("具体的FlyWeight："+extrinsicstate);
    }
}
