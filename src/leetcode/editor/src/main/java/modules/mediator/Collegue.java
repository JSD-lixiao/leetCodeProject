package modules.mediator;

/**
 * @author lixiao
 * @version 1.0
 * @date 2020/6/9 10:24
 */
public abstract class Collegue {
    protected AbstractMediator abstractMediator;
    public Collegue(AbstractMediator abstractMediator){
        this.abstractMediator = abstractMediator;
    }
}
