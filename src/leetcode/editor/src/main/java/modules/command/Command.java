package modules.command;

import lombok.Setter;

/**
 * @author lixiao
 * @version 1.0
 * @date 2020/6/5 13:54
 */
@Setter
public abstract class Command {
    protected Receiver receiver;

    abstract public void execute();
}
