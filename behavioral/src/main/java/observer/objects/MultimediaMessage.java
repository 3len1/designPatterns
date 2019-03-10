package observer.objects;

import observer.enums.Application;
import observer.enums.MessageType;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * Created by 3len1 on 2/5/2019.
 */
public class MultimediaMessage extends Message {
    private Deque<String> messageHistory = new ArrayDeque<>();

    public MultimediaMessage() {
        super.setType(MessageType.MULTIMEDIA);
        super.setApplicationList(Arrays.asList(Application.MESSENGER,
                Application.SKYPE, Application.VIBER,
                Application.SLACK, Application.DISCORD));
    }

    @Override
    public String getState() {
        return messageHistory.getLast();
    }

    @Override
    public void setState(String message) {
        messageHistory.add(message);
        this.notifyObservers();
    }
}
