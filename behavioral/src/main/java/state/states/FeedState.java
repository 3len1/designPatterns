package state.states;

import lombok.AllArgsConstructor;
import state.enums.BatteryLevel;
import state.exceptions.NotEnoughBattery;
import state.objects.Dummagotchi;

/**
 * Created by 3len1 on 2/6/2019.
 */
@AllArgsConstructor
public class FeedState extends State {
    private static final String EAT_MSG = "Omm nomm ommm. Delicious";
    private static final int ENERGY = 25;
    private Dummagotchi dummagotchi;


    @Override
    public void handleRequest() {
        if (dummagotchi.getBatteryLevel() == BatteryLevel.EMPTY)
            throw new NotEnoughBattery();
        System.out.println(EAT_MSG);
        dummagotchi.setBatteryLevel(BatteryLevel.valueOfInt(dummagotchi.getBatteryLevel().getPrc() + ENERGY));
        dummagotchi.setState(dummagotchi.getFeedState());
    }

    public String toString() {
        return EAT_MSG;
    }
}
