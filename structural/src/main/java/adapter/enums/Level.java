package adapter.enums;

import adapter.exceptions.NotValidValueException;

/**
 * Created by 3len1 on 2/12/2019.
 */
public enum Level {
    HARD(20),
    MEDIUM(10),
    EASY(5);

    private int number;

    private Level(int number) {
        this.number = number;
    }

    public static Level fromNumber(int n) {
        switch (n) {
            case 20:
                return Level.HARD;
            case 10:
                return Level.MEDIUM;
            case 5:
                return Level.EASY;
            default:
                throw new NotValidValueException(Level.class, "There is no level for value: "
                        + n + ". Available levels [HARD(20),MEDIUM(10),EASY(5)].");
        }

    }

    public int getNumber() {
        return number;
    }
}
