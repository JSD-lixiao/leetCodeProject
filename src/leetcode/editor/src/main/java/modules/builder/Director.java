package modules.builder;

/**
 * @author lixiao
 * @version 1.0
 * @date 2020/5/16 9:05
 */
public class Director {
    public void build(Builder builder){
        builder.buildPartA();
        builder.buildPartB();
    }
}
