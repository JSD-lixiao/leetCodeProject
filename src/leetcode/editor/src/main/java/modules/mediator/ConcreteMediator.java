package modules.mediator;

import lombok.Setter;

/**
 * @author lixiao
 * @version 1.0
 * @date 2020/6/9 10:26
 */
@Setter
public class ConcreteMediator extends AbstractMediator {

    private ConcreteCollegue1 concreteCollegue1;
    private ConcreteCollegue2 concreteCollegue2;

    @Override
    public void send(String message, Collegue collegue) {
        if (collegue.equals(concreteCollegue1)){
            concreteCollegue2.notify(message);
        }else if (collegue.equals(concreteCollegue2)){
            concreteCollegue1.notify(message);
        }
    }
}
