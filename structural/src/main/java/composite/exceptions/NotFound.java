package composite.exceptions;

import composite.enums.Emotion;

/**
 * Created by 3len1 on 3/11/2019.
 */
public class NotFound extends RuntimeException {
    public NotFound(String message) {
        super(message);
    }

    public NotFound(Emotion emotion) {
        super("Not Found value for  " + emotion.getString() + "\n");
    }

    public NotFound(Emotion emotion, String message) {
        super("Not Found value for  " + emotion.getString() + ": " + message);
    }
}

