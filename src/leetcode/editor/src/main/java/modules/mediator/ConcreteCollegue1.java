package modules.mediator;

/**
 * @author lixiao
 * @version 1.0
 * @date 2020/6/9 10:30
 */
public class ConcreteCollegue1 extends Collegue {

    public ConcreteCollegue1(AbstractMediator abstractMediator) {
        super(abstractMediator);
    }
    public void send(String message){
        abstractMediator.send(message,this);
    }
    public void notify(String message){
        System.out.println("同事1得到信息:"+message);
    }
}
