package decorator.enums;

/**
 * Created by 3len1 on 3/12/2019.
 */
public enum BeverageType {
    CHOCOLATE("Chocolate"),
    COFFEE("Coffee"),
    TEA("Tea");

    private String string;

    private BeverageType(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }
}
