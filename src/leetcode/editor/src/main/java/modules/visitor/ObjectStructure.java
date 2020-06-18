package modules.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lixiao
 * @version 1.0
 * @date 2020/6/18 8:51
 */
public class ObjectStructure {
    private List<Element> elements = new ArrayList<>();

    public void attach(Element element) {
        this.elements.add(element);
    }

    public void detach(Element element) {
        this.elements.removeIf(element::equals);
    }

    public void accept(Visitor visitor) {
        for (Element element : elements) {
            element.accept(visitor);
        }
    }

}
