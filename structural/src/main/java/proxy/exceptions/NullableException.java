package proxy.exceptions;

/**
 * Created by 3len1 on 4/28/2019.
 */
public class NullableException extends RuntimeException {

    public NullableException(String message) {
        super(message);
    }

    public NullableException(Class clazz, String message) {
        super("No object found for " + clazz.getSimpleName() + ": " + message);
    }
}

