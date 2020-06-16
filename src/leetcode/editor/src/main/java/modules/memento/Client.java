package modules.memento;

/**
 * 备忘录模式
 * @author lixiao
 * @version 1.0
 * @date 2020/6/2 13:54
 */
public class Client {
    public static void main(String[] args) {
        // 设置初始状态
        Originator o = new Originator();
        o.setState("On");
        o.show();
        // 记录状态
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(o.createMemento());
        // 改变原始状态
        o.setState("Off");
        o.show();
        // 恢复状态
        o.setMemento(caretaker.getMemento());
        o.show();
    }
}
