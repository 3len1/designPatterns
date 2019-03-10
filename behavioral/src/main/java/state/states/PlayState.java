package state.states;

import lombok.AllArgsConstructor;
import state.enums.BatteryLevel;
import state.exceptions.NotEnoughBattery;
import state.objects.Dummagotchi;

/**
 * Created by 3len1 on 2/6/2019.
 */
@AllArgsConstructor
public class PlayState extends State {
    private static final String PLAY_MSG = "Let's play, hooray *giggles* ^^.";
    private static final int ENERGY = 30;
    private Dummagotchi dummagotchi;


    @Override
    public void handleRequest() {
        if (dummagotchi.getBatteryLevel() == BatteryLevel.EMPTY)
            throw new NotEnoughBattery();
        System.out.println(PLAY_MSG);
        dummagotchi.setBatteryLevel(BatteryLevel.valueOfInt(dummagotchi.getBatteryLevel().getPrc() - ENERGY));
        dummagotchi.setState(dummagotchi.getPlayState());
    }

    public String toString() {
        return PLAY_MSG;
    }
}
