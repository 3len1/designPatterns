package facade.exceptions;

/**
 * Created by 3len1 on 4/14/2019.
 */
public class NotSupportedException extends RuntimeException {
    public NotSupportedException(String message) {
        super(message);
    }

    public NotSupportedException(Class clazz, String message) {
        super(clazz.getSimpleName() + " encryption not supported for text=[" + message + "]");
    }
}
