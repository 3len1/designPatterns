package state.enums;

import state.exceptions.NotValidException;

/**
 * Created by 3len1 on 2/6/2019.
 */
public enum BatteryLevel {
    FULL(100),
    HIGHT(75),
    MEDIUM(50),
    LOW(25),
    ALMOST_EMPTY(1),
    EMPTY(0);

    private static final String PRC_ERROR = "The prc you enter is not valid. Prc must be between 0 and 100";
    private int prc;

    private BatteryLevel(int prc) {
        this.prc = prc;
    }

    public static BatteryLevel valueOfInt(int prc) {
        if (prc > 100 || prc < 0)
            throw new NotValidException(PRC_ERROR);
        else if (prc == 0)
            return BatteryLevel.EMPTY;
        else if (prc < 25)
            return BatteryLevel.ALMOST_EMPTY;
        else if (prc < 75)
            return BatteryLevel.MEDIUM;
        else if (prc < 100)
            return BatteryLevel.HIGHT;
        else
            return BatteryLevel.FULL;
    }

    public int getPrc() {
        return prc;
    }
}
