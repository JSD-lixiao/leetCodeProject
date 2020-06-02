package modules.compostite;

/**
 * @author lixiao
 * @version 1.0
 * @date 2020/6/2 14:38
 */
public class Left extends Component{

    public Left(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        System.out.println("不能向leaf节点添加节点");
    }

    @Override
    public void remove(Component component) {
        System.out.println("不能从leaf节点删除节点");
    }

    @Override
    public void display(int depth) {
        System.out.println("depth = " + depth+"-"+name);
    }
}
