package composite.exceptions;

import composite.enums.Label;

/**
 * Created by 3len1 on 3/11/2019.
 */
public class NotFound extends RuntimeException {
    public NotFound(String message) {
        super(message);
    }

    public NotFound(Label label) {
        super("Not Found value for  " + label.getString() + "\n");
    }

    public NotFound(Label label, String message) {
        super("Not Found value for  " + label.getString() + ": " + message);
    }
}

