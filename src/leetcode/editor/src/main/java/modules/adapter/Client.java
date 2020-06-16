package modules.adapter;

/**
 * 适配器模式
 * @author lixiao
 * @version 1.0
 * @date 2020/5/27 16:35
 */
public class Client {
    public static void main(String[] args) {
        Player forward = new Forwards("加内特");
        Player center = new Center("奥尼尔");
        Player foreignCenter = new Translator("姚明");
        Boss boss = new Boss();
        boss.attach(forward);
        boss.attach(center);
        boss.attach(foreignCenter);
        boss.everyBodyAttack();
        foreignCenter.defense();
    }
}
