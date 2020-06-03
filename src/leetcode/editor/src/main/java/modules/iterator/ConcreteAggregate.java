package modules.iterator;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lixiao
 * @version 1.0
 * @date 2020/6/3 13:49
 */
@Data
public class ConcreteAggregate<T> extends Aggregate{

    private List<T> items;

    @Override
    public Iterator createIterator() {
        return new ConcreterIterator(this);
    }
    public int size(){
        return this.items.size();
    }
    public T getItem(int i){
        return items.get(i);
    }

}
