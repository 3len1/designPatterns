package state.exceptions;

/**
 * Created by 3len1 on 2/6/2019.
 */
public class NotValidException extends RuntimeException {
    public NotValidException(String message) {
        super(message);
    }

    public NotValidException(String code, String message) {
        super("Code: " + code + " " + message);
    }
}
