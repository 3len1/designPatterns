package builder.validation;

/**
 * Created by 3len1 on 1/25/2019.
 */
public class ValidationExceptions extends RuntimeException {
    public ValidationExceptions(String message) {
        super(message);
    }

    public ValidationExceptions(String field, String message) {
        super("Validation error \n Field: " + field + " " + message);
    }

}
