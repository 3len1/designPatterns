package decorator.enums;

import decorator.exceptions.NotFound;

import java.util.Arrays;

/**
 * Created by 3len1 on 3/13/2019.
 */
public enum Flavor {
    CHOCOLATE("chocolate", 1),
    VANILLA("vanilla", 2),
    CARAMEL("caramel", 3),
    STRAWBERRY("strawberry", 4),
    BANANA("banana", 5);

    private String string;
    private int num;

    private Flavor(String string, int num) {
        this.string = string;
        this.num = num;
    }

    public static Flavor fromNumber(int num) {
        if (num > 0 && num < Flavor.values().length) {
            return Arrays.stream(Flavor.values())
                    .filter(flavor -> flavor.getNum() == num).findFirst()
                    .orElseThrow(() -> new NotFound("No flavor found for value " + num + "."));
        }
        throw new NotFound("No flavor found for value " + num + ".");
    }

    public static String printValus() {
        StringBuilder builder = new StringBuilder();
        builder.append("Flavors\n_________________________________________\n");
        Arrays.stream(Flavor.values()).forEach(flavor ->
                builder.append(flavor.getString() + ": " + flavor.getNum() + "\n")
        );
        return builder.toString();
    }

    public String getString() {
        return string;
    }

    public int getNum() {
        return num;
    }
}
