package modules.compostite;

import lombok.Data;

/**
 * @author lixiao
 * @version 1.0
 * @date 2020/6/2 14:33
 */
@Data
public abstract class Component {
    protected String name;
    Component(String name){
        this.name = name;
    }
    public abstract void add(Component component);
    public abstract void remove(Component component);
    public abstract void display(int depth);
}
