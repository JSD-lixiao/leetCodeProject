package modules.command;

/**
 * 命令模式
 * @author lixiao
 * @version 1.0
 * @date 2020/6/5 13:38
 */
public class Client {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command c = new ConcreteCommand();
        c.setReceiver(receiver);
        Invoker invoker = new Invoker();
        invoker.setCommand(c);
        invoker.executeComman();
    }
}
