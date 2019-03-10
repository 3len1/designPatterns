package observer.objects;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import observer.enums.Application;
import observer.enums.MessageType;
import observer.observers.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 3len1 on 2/5/2019.
 */
@Getter
@Setter
@ToString
public abstract class Message {
    private MessageType type;
    private List<Application> applicationList;

    private List<Observer> observers = new ArrayList<>();

    public abstract String getState();

    public abstract void setState(String state);

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers)
            observer.update();
    }
}
