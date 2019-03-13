package decorator.enums;

import decorator.exceptions.NotFound;

import java.util.Arrays;

/**
 * Created by 3len1 on 3/13/2019.
 */
public enum FruitName {
    LIME("lime", 1),
    LEMON("lemon", 2),
    ORANGE("orange", 3),
    BERRIES("berries", 4),
    STRAWBERRY("strawberry", 5);

    private String string;
    private int num;

    private FruitName(String string, int num) {
        this.string = string;
        this.num = num;
    }

    public static FruitName fromNumber(int num) {
        if (num > 0 && num < FruitName.values().length) {
            return Arrays.stream(FruitName.values())
                    .filter(fruit -> fruit.getNum() == num).findFirst()
                    .orElseThrow(() -> new NotFound("No FruitName found for value " + num + "."));
        }
        throw new NotFound("No FruitName found for value " + num + ".");
    }

    public static String printValus() {
        StringBuilder builder = new StringBuilder();
        builder.append("Fruits\n_________________________________________\n");
        Arrays.stream(FruitName.values()).forEach(fruit ->
                builder.append(fruit.getString() + ": " + fruit.getNum() + "\n")
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
