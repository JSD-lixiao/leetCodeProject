package modules.state;

import lombok.Data;

/**
 * @author lixiao
 * @version 1.0
 * @date 2020/5/27 15:50
 */
@Data
public class Work {
    Integer hour;
    Boolean finished;
    State state;

    Work(){
        state  = new ForenoonState();
    }
    void writeProgram(){
        state.writeProgram(this);
    }
}
