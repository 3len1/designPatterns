package decorator.enums;

/**
 * Created by 3len1 on 3/13/2019.
 */
public enum Heat {
    COLD("cold"),
    HOT("hot");

    private String string;

    private Heat(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }
}
