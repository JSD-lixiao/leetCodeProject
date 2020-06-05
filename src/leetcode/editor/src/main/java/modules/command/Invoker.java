package modules.command;

import lombok.Setter;

/**
 * @author lixiao
 * @version 1.0
 * @date 2020/6/5 13:57
 */
@Setter
public class Invoker {
    private Command command;

    public void executeComman(){
        command.execute();
    }
}
