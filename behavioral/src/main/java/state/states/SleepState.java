package state.states;

import state.enums.BatteryLevel;
import state.exceptions.NotEnoughBattery;
import state.objects.Dummagotchi;

/**
 * Created by 3len1 on 2/6/2019.
 */
public class SleepState extends State {
    private static final int ENERGY = 50;
    private static String SLEEP_MSG = "Goodnight, Dummagotchi go to sleep zzZZZzzZZzz";
    private static String TIRED_MSG = "Dummagotchi is tired , it's better to sleep";
    private Dummagotchi dummagotchi;

    public SleepState(Dummagotchi dummagotchi) {
        if (!dummagotchi.getName().isEmpty()) {
            SLEEP_MSG = SLEEP_MSG.replace("Dummagotchi", dummagotchi.getName());
            TIRED_MSG = TIRED_MSG.replace("Dummagotchi", dummagotchi.getName());
        }
        this.dummagotchi = dummagotchi;
    }

    @Override
    public void handleRequest() {
        if (dummagotchi.getBatteryLevel() == BatteryLevel.EMPTY)
            throw new NotEnoughBattery();
        else if (dummagotchi.getBatteryLevel() == BatteryLevel.LOW)
            System.out.println(TIRED_MSG);
        else
            System.out.println(SLEEP_MSG);
        dummagotchi.setBatteryLevel(BatteryLevel.valueOfInt(dummagotchi.getBatteryLevel().getPrc() + ENERGY));
        dummagotchi.setState(dummagotchi.getSleepState());
    }

    public String toString() {
        if (dummagotchi.getBatteryLevel() == BatteryLevel.LOW)
            return TIRED_MSG;
        return SLEEP_MSG;
    }
}
