package state.exceptions;

/**
 * Created by 3len1 on 2/6/2019.
 */
public class NotEnoughBattery extends RuntimeException {
    private static final String MSG = "Dummagotchi has run out of battery, please recharge!";

    public NotEnoughBattery() {
        super(MSG);
    }

    public NotEnoughBattery(String message) {
        super(message);
    }
}
