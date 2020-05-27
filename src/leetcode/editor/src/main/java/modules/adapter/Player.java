package modules.adapter;

/**
 * @author lixiao
 * @version 1.0
 * @date 2020/5/27 16:26
 */
public abstract class Player {
    protected String name;
    Player(String name){
        this.name = name;
    }
    abstract void attack();
    abstract void defense();
}
