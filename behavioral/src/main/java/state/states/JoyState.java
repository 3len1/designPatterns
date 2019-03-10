package state.states;

import state.enums.BatteryLevel;
import state.exceptions.NotEnoughBattery;
import state.objects.Dummagotchi;

/**
 * Created by 3len1 on 2/6/2019.
 */
public class JoyState extends State {
    private static String HUG_MSG = "Dummagotchi love you ♥ *hug tight* ♥";
    private Dummagotchi dummagotchi;

    public JoyState(Dummagotchi dummagotchi) {
        if (!dummagotchi.getName().isEmpty())
            HUG_MSG = HUG_MSG.replace("Dummagotchi", dummagotchi.getName());
        this.dummagotchi = dummagotchi;
    }

    @Override
    public void handleRequest() {
        if (dummagotchi.getBatteryLevel() == BatteryLevel.EMPTY)
            throw new NotEnoughBattery();
        System.out.println(HUG_MSG);
        dummagotchi.setBatteryLevel(BatteryLevel.FULL);
        dummagotchi.setState(dummagotchi.getJoyState());
    }

    public String toString() {
        return HUG_MSG;
    }
}
