package modules.flyweight;

/**
 * @author lixiao
 * @version 1.0
 * @date 2020/6/16 9:24
 */
public class UnsharedConcreteFlyWeight extends FlyWeight{
    @Override
    public void operate(int extrinsicstate) {
        System.out.println("不共享的FlyWeight："+extrinsicstate);
    }
}
