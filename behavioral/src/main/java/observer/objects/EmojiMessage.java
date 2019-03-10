package observer.objects;

import observer.enums.Application;
import observer.enums.MessageType;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * Created by 3len1 on 2/5/2019.
 */
public class EmojiMessage extends Message {
    private Deque<String> messageHistory = new ArrayDeque<>();

    public EmojiMessage() {
        super.setType(MessageType.EMOJI);
        super.setApplicationList(Arrays.asList(Application.MESSENGER, Application.FACEBOOK,
                Application.SKYPE, Application.VIBER, Application.WHATS_APP,
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
