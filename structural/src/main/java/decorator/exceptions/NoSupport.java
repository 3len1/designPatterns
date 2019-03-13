package decorator.exceptions;

import decorator.enums.BeverageType;

/**
 * Created by 3len1 on 3/13/2019.
 */
public class NoSupport extends RuntimeException {
    public NoSupport(String message) {
        super(message);
    }

    public NoSupport(Class clazz, String message) {
        super("No support " + clazz.getSimpleName() + ": " + message);
    }

    public NoSupport(Class clazz, BeverageType beverageType) {
        super("No support " + clazz.getSimpleName() + " for " + beverageType.getString() + " beverage.");
    }
}
