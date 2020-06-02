package modules.memento;

import lombok.Data;

/**
 * @author lixiao
 * @version 1.0
 * @date 2020/6/2 14:11
 */
@Data
public class Memento {
    private String state;
    public Memento(String state){
        this.state = state;
    }
}
