package modules.flyweight;

import java.util.Hashtable;

/**
 * @author lixiao
 * @version 1.0
 * @date 2020/6/16 9:19
 */
public class FlyWeightFactory {
    private Hashtable flyWeights = new Hashtable();

    public FlyWeightFactory(){
        init();
    }
    private void init(){
        flyWeights.put("X",new ConcreteFlyWeight());
        flyWeights.put("Y",new ConcreteFlyWeight());
        flyWeights.put("Z",new ConcreteFlyWeight());
    }

    public FlyWeight getFlyWeight(String key){
        return (FlyWeight) flyWeights.get(key);
    }

}
