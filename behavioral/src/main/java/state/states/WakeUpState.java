package state.states;

import state.objects.Dummagotchi;

/**
 * Created by 3len1 on 2/6/2019.
 */
public class WakeUpState extends State {
    private static String WAKE_UP_MSG = "Good morning ♥ Dummagotchi love chu *SmoutS*";
    private Dummagotchi dummagotchi;

    public WakeUpState(Dummagotchi dummagotchi) {
        if (!dummagotchi.getName().isEmpty())
            WAKE_UP_MSG = WAKE_UP_MSG.replace("Dummagotchi", dummagotchi.getName());
        this.dummagotchi = dummagotchi;
    }

    @Override
    public void handleRequest() {
        System.out.println(WAKE_UP_MSG);
        dummagotchi.setState(dummagotchi.getWakeUpState());
    }

    public String toString() {
        return WAKE_UP_MSG;
    }
}
