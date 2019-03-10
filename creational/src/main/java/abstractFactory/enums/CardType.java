package abstractFactory.enums;

/**
 * Created by 3len1 on 1/30/2019.
 */
public enum CardType {
    NORMAL(false),
    EXTREME(true);

    private final boolean value;

    private CardType(boolean value) {
        this.value = value;
    }

    public boolean getValue() {
        return value;
    }
}
