package observer.observers;

import observer.enums.Application;
import observer.objects.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by 3len1 on 2/5/2019.
 */
public class SkypeClientObserver extends Observer {
    private static final Logger LOGGER = LoggerFactory.getLogger(SkypeClientObserver.class);
    private Application application;

    public SkypeClientObserver(Message message) {
        this.message = message;
        this.application = Application.SKYPE;
        message.attach(this);
    }

    public void addMessage(String msg) {
        if (this.message.getApplicationList().contains(this.application))
            this.message.setState(msg +
                    " - sent from " + this.application.getDescription());
        else
            throw new RuntimeException("Message type " + message.getType() +
                    " can sent only by [" + message.getApplicationList() + "]");
    }

    @Override
    public void update() {
        LOGGER.info(this.application.getDescription() + " stream: " + message.getState());
    }
}
