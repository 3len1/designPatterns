package state.states;

import state.enums.BatteryLevel;
import state.exceptions.NotEnoughBattery;
import state.objects.Dummagotchi;

/**
 * Created by 3len1 on 2/6/2019.
 */
public class HungryState extends State {
    private static final int ENERGY = 25;
    private static String HUNGRY_MSG = "Gru gru, Dummagotchi is hungry, feed me please.";
    private Dummagotchi dummagotchi;

    public HungryState(Dummagotchi dummagotchi) {
        if (!dummagotchi.getName().isEmpty())
            HUNGRY_MSG = HUNGRY_MSG.replace("Dummagotchi", dummagotchi.getName());
        this.dummagotchi = dummagotchi;
    }

    @Override
    public void handleRequest() {
        if (dummagotchi.getBatteryLevel() == BatteryLevel.EMPTY)
            throw new NotEnoughBattery();
        System.out.println(HUNGRY_MSG);
        dummagotchi.setBatteryLevel(BatteryLevel.valueOfInt(dummagotchi.getBatteryLevel().getPrc() - ENERGY));
        dummagotchi.setState(dummagotchi.getHungryState());
    }

    public String toString() {
        return HUNGRY_MSG;
    }
}

