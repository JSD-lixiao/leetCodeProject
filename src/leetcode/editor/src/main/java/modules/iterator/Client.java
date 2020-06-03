package modules.iterator;

import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author lixiao
 * @version 1.0
 * @date 2020/6/3 13:44
 */
public class Client {
    public static void main(String[] args) {
        ConcreteAggregate aggregate = new ConcreteAggregate();
        Iterator iterator = aggregate.createIterator();
        List<String> list = new ArrayList<>();
        list.add("tom");
        list.add("jack");
        list.add("jkflaslf");
        aggregate.setItems(list);
        while (!iterator.isDone()) {
            System.out.println(iterator.next());
        }

    }
}
