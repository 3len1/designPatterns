package observer;

import observer.objects.Message;
import observer.objects.MultimediaMessage;
import observer.objects.StickerMessaga;
import observer.objects.TextMessage;
import observer.observers.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by 3len1 on 2/5/2019.
 */
public class ObserverDemo {
    private static final Logger LOGGER = LoggerFactory.getLogger(ObserverDemo.class);

    public static void main(String args[]) {

        LOGGER.info("Observer example with messages. Have fun to try it!");
        LOGGER.info("Add more clients(Observers) and messages to check it out\n");

        Message textMsg = new TextMessage();
        Message stickerMsg = new StickerMessaga();
        Message multimediaMsg = new MultimediaMessage();

        SmsClientObserver phone = new SmsClientObserver(textMsg);
        ViberClientObserver viber = new ViberClientObserver(textMsg);
        FacebookClientObserver facebook = new FacebookClientObserver(stickerMsg);
        SkypeClientObserver skype = new SkypeClientObserver(stickerMsg);
        MessengerClientObserver messenger = new MessengerClientObserver(multimediaMsg);

        phone.addMessage("This message can been seen by phone and viber");
        skype.addMessage("This message can been seen by skype and facebook");
        messenger.addMessage("This message can been seen by messenger");
    }

}
