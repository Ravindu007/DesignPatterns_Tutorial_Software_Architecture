package observer;

import java.util.ArrayList;
import java.util.List;


public class Subject {
    private List<Observer> observers = new ArrayList<>();
    private String state;

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void setState(String state){
        this.state = state;
        notifyAllObservers();
    }

    public void notifyAllObservers(){
        for (Observer observer: observers){
            observer.update(state);
        }
    }
}
