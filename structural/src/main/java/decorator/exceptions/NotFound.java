package decorator.exceptions;

/**
 * Created by 3len1 on 3/13/2019.
 */
public class NotFound extends RuntimeException {
    public NotFound(String message) {
        super(message);
    }
}
