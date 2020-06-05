package modules.command;

/**
 * @author lixiao
 * @version 1.0
 * @date 2020/6/5 13:58
 */
public class ConcreteCommand extends Command{

    @Override
    public void execute() {
        receiver.action();
    }
}
