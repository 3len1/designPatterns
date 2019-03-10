package adapter.enums;

import adapter.exceptions.NotValidValueException;

/**
 * Created by 3len1 on 2/12/2019.
 */
public enum Element {
    BALL(1),
    BEADS(2),
    BOX(3),
    CARDBOARD(4),
    CONTAINER(5),
    FABRIC(6),
    FLOWERS(7),
    FLUFF_BALLS(8),
    GLASS_BOTTLE(9),
    PLASTIC_BOTTLE(10),
    RIBBON(11),
    SPONGE(12),
    STICKERS(13),
    STICKS(14),
    THREAD(15),
    WOOD(16),
    WOOL(17),
    WOVEN_PAPER(18),
    WRAPPING(19);

    private int id;

    private Element(int id) {
        this.id = id;
    }

    public static Element fromId(int id) {
        if (id > 0 && id < 20)
            for (Element type : values()) {
                if (type.getId() == id) {
                    return type;
                }
            }
        throw new NotValidValueException(Element.class, "The id (" + id + ") is not valid");
    }

    public int getId() {
        return id;
    }
}
