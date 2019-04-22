package flyweight.enums;

import flyweight.exceptions.NotValidValueException;

/**
 * Created by 3len1 on 4/22/2019.
 */
public enum Color {
    WHITE("white", 1),
    BLACK("black", 2),
    BLUE("blue", 3),
    CYAN("cyan", 4),
    GOLD("gold", 5),
    GOLD_PINK("gold pink", 6),
    GREY("grey", 7),
    PINK("pink", 8),
    SILVER("silver", 9),
    UNKNOWN("", 0);

    private String name;
    private int id;

    private Color(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public static Color fromId(int id) {
        if (id >= 0 && id <= 9)
            for (Color color : values()) {
                if (color.getId() == id) {
                    return color;
                }
            }
        throw new NotValidValueException(Color.class, "The id (" + id + ") is not valid");
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return super.toString() +
                "(" + id + ")";
    }
}
