package state.states;

import state.enums.BatteryLevel;
import state.exceptions.NotEnoughBattery;
import state.objects.Dummagotchi;

/**
 * Created by 3len1 on 2/6/2019.
 */
public class SickState extends State {
    private static final int ENERGY = 50;
    private static String SICK_MSG = " =( Dummagotchi is ill. Take care of it";
    private Dummagotchi dummagotchi;

    public SickState(Dummagotchi dummagotchi) {
        if (!dummagotchi.getName().isEmpty())
            SICK_MSG = SICK_MSG.replace("Dummagotchi", dummagotchi.getName());
        this.dummagotchi = dummagotchi;
    }

    @Override
    public void handleRequest() {
        if (dummagotchi.getBatteryLevel() == BatteryLevel.EMPTY)
            throw new NotEnoughBattery();
        System.out.println(SICK_MSG);
        dummagotchi.setBatteryLevel(BatteryLevel.valueOfInt(dummagotchi.getBatteryLevel().getPrc() - ENERGY));
        dummagotchi.setState(dummagotchi.getSickState());
    }

    public String toString() {
        return SICK_MSG;
    }
}
