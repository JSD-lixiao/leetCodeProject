package modules.iterator;

/**
 * @author lixiao
 * @version 1.0
 * @date 2020/6/3 13:48
 */
public class ConcreterIterator implements Iterator {
    private ConcreteAggregate concreteAggregate;
    private int current = 0;

    public ConcreterIterator(ConcreteAggregate concreteAggregate) {
        this.concreteAggregate = concreteAggregate;
    }

    @Override
    public Object first() {
        return concreteAggregate.getItem(0);
    }

    @Override
    public Object next() {
        Object ret = null;
        if (current < concreteAggregate.size()) {
            ret = concreteAggregate.getItem(current);
        }
        current++;
        return ret;
    }

    @Override
    public boolean isDone() {
        return this.current >= this.concreteAggregate.size();
    }

    @Override
    public Object currentItem() {
        return this.concreteAggregate.getItem(current);
    }
}
