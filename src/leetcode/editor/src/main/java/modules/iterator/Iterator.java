package modules.iterator;

/**
 * @author lixiao
 * @version 1.0
 * @date 2020/6/3 13:45
 */
public interface Iterator {
     Object first();
     Object next();
     boolean isDone();
     Object currentItem();

}
