package modules.adapter;


/**
 * @author lixiao
 * @version 1.0
 * @date 2020/5/27 16:31
 */

public class Translator extends Player{
    private ForeignCenter foreignCenter = new ForeignCenter();

    Translator(String name) {
        super(name);
        foreignCenter.setName(name);
    }
    @Override
    void attack() {
        this.foreignCenter.jingong();
    }

    @Override
    void defense() {
        this.foreignCenter.fangshou();
    }
}
