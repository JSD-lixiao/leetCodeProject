package modules.memento;

import lombok.Data;

/**
 * @author lixiao
 * @version 1.0
 * @date 2020/6/2 14:10
 */
@Data
public class Originator {
    private String state;
    public Memento createMemento(){
        return new Memento(this.state);
    }
    public void setMemento(Memento memento){
        this.state = memento.getState();
    }
    public void show(){
        System.out.println("state = " + state);
    }
}
