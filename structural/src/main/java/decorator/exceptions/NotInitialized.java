package decorator.exceptions;

/**
 * Created by 3len1 on 3/13/2019.
 */
public class NotInitialized extends RuntimeException {
    public NotInitialized(String message) {
        super(message);
    }

    public NotInitialized(Class clazz, String message) {
        super("Not initialized value for " + clazz.getSimpleName() + ": " + message);
    }
}
