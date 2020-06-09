package modules.chain;

import lombok.Data;

/**
 * @author lixiao
 * @version 1.0
 * @date 2020/6/9 9:55
 */
@Data
public abstract class Manager {
    protected String name;
    protected Manager superior;
    public Manager(String name){
        this.name = name;
    }
    public abstract void requestApplications(Request request);
}
