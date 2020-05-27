package modules.adapter;

/**
 * @author lixiao
 * @version 1.0
 * @date 2020/5/27 16:28
 */
public class Center extends Player{
    Center(String name) {
        super(name);
    }

    @Override
    void attack() {
        System.out.println(String.format("中锋：%s,进攻",this.name));
    }

    @Override
    void defense() {
        System.out.println(String.format("中锋：%s,防守",this.name));
    }
}
