package modules.builder;

/**
 * 建造器模式
 * @author lixiao
 * @version 1.0
 * @date 2020/5/16 9:01
 */
public abstract class Builder {
    abstract void buildPartA();
    abstract void buildPartB();
    abstract Product getResult();
}
