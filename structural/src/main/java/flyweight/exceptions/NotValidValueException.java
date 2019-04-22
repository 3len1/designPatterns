package flyweight.exceptions;

/**
 * Created by 3len1 on 2/12/2019.
 */
public class NotValidValueException extends RuntimeException {
    public NotValidValueException(String message) {
        super(message);
    }

    public NotValidValueException(Class clazz, String message) {
        super("Not value find for enum " + clazz.getSimpleName() + ": " + message);
    }
}
