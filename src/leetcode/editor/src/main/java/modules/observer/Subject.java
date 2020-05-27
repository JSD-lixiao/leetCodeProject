package modules.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lixiao
 * @version 1.0
 * @date 2020/5/22 9:51
 */
public abstract class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void attch(Observer observer){
        observers.add(observer);
    }
    public void detach(Observer observer){
        observers.removeIf(observer::equals);
    }
    public void notifyObservers(){
        for (Observer observer : observers){
            observer.update();
        }
    }
}
