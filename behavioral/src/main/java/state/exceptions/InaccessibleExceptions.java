package state.exceptions;

/**
 * Created by 3len1 on 2/6/2019.
 */
public class InaccessibleExceptions extends RuntimeException {
    public InaccessibleExceptions(String message) {
        super(message);
    }

    public InaccessibleExceptions(String code, String message) {
        super("Code: " + code + " " + message);
    }

}
