package adapter.enums;

import adapter.exceptions.NotValidValueException;

/**
 * Created by 3len1 on 2/12/2019.
 */
public enum Color {
    AMBER(1),
    APRICOT(2),
    AZURE(3),
    BLACK(4),
    BLUE(5),
    BLUE_GREEN(6),
    BLUE_VIOLET(7),
    BROWN(8),
    CERULEAN(9),
    CHARTREUSE(10),
    CYAN(11),
    GOLD(12),
    GREEN(13),
    GREY(14),
    INDIGO(15),
    LIME(16),
    MAGENTA(17),
    MAROON(18),
    NAVY(19),
    OCHRE(20),
    OLIVE(21),
    ORANGE(22),
    ORANGE_RED(24),
    PEACH(25),
    PINK(26),
    PLUM(27),
    PURPLE(28),
    RED(29),
    RED_VIOLET(30),
    ROSE(31),
    SILVER(32),
    SKY_BLUE(33),
    TEAL(34),
    TURQUOISE(35),
    VIOLET(36),
    WHITE(37),
    YELLOW(38);

    private int id;

    private Color(int id) {
        this.id = id;
    }

    public static Color fromId(int id) {
        if (id > 0 && id < 39)
            for (Color color : values()) {
                if (color.getId() == id) {
                    return color;
                }
            }
        throw new NotValidValueException(Color.class, "The id (" + id + ") is not valid");
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
