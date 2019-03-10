package state.enums;

import state.exceptions.NotValidException;

/**
 * Created by 3len1 on 2/6/2019.
 */
public enum DummagotchiState {
    WAKE_UP(1),
    JOY(2),
    PLAY(3),
    HUNGRY(4),
    FEED(5),
    SICK(6),
    SLEEP(7),
    POWER_OFF(8);

    private static final String ERROR = "Dummagotchi has only 8 states. The given number isn't between 1 and 8";
    private int value;

    private DummagotchiState(int value) {
        this.value = value;
    }

    public static DummagotchiState valueOfInt(int i) {
        switch (i) {
            case 1:
                return DummagotchiState.WAKE_UP;
            case 2:
                return DummagotchiState.JOY;
            case 3:
                return DummagotchiState.PLAY;
            case 4:
                return DummagotchiState.HUNGRY;
            case 5:
                return DummagotchiState.FEED;
            case 6:
                return DummagotchiState.SICK;
            case 7:
                return DummagotchiState.SLEEP;
            case 8:
                return DummagotchiState.POWER_OFF;
            default:
                throw new NotValidException(ERROR);
        }
    }

    public int getValue() {
        return value;
    }
}
