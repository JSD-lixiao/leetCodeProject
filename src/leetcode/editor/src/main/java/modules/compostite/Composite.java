package modules.compostite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lixiao
 * @version 1.0
 * @date 2020/6/2 14:41
 */
public class Composite extends Component {
    private List<Component> children = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        this.children.add(component);
    }

    @Override
    public void remove(Component component) {
        this.children.removeIf(c -> c.getName().equals(component.getName()));
    }

    @Override
    public void display(int depth) {
        System.out.println("depth = " + depth + "-" + name);
        for (Component component : children) {
            component.display(depth + 2);
        }
    }
}
