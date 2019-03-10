package state.states;

import lombok.Getter;
import state.enums.BatteryLevel;
import state.objects.Dummagotchi;

/**
 * Created by 3len1 on 2/6/2019.
 */
@Getter
public class PowerOffState extends State {
    private static final String POWER_OFF_MSG = "Power off, bye bye see you soon ^.^";
    private static String BATTERY_MSG = "Dummagotchi battery run out, please recharge";
    private Dummagotchi dummagotchi;

    public PowerOffState(Dummagotchi dummagotchi) {
        if (!dummagotchi.getName().isEmpty())
            BATTERY_MSG = BATTERY_MSG.replace("Dummagotchi", dummagotchi.getName());
        this.dummagotchi = dummagotchi;
    }

    @Override
    public void handleRequest() {
        System.out.println(POWER_OFF_MSG);
        dummagotchi.setState(dummagotchi.getPowerOffState());
    }

    public String toString() {
        if (dummagotchi.getBatteryLevel() == BatteryLevel.EMPTY)
            return BATTERY_MSG;
        return POWER_OFF_MSG;
    }
}
