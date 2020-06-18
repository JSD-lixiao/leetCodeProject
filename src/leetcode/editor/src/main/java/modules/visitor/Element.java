package modules.visitor;

/**
 * 被访问者接口
 * @author lixiao
 * @version 1.0
 * @date 2020/6/18 8:46
 */
public interface Element {
    void accept(Visitor visitor);
}
