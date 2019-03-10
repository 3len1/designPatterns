package state.objects;

import lombok.*;
import state.enums.BatteryLevel;
import state.enums.DummagotchiState;
import state.states.*;

/**
 * Created by 3len1 on 2/6/2019.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Dummagotchi {
    private String name;
    private BatteryLevel batteryLevel;

    private State wakeUpState;
    private State joyState;
    private State playState;
    private State hungryState;
    private State feedState;
    private State sickState;
    private State sleepState;
    private State powerOffState;
    private State state;

    public Dummagotchi(String name) {
        this.name = name;
        this.batteryLevel = BatteryLevel.FULL;
        this.wakeUpState = new WakeUpState(this);
        this.joyState = new JoyState(this);
        this.playState = new PlayState(this);
        this.hungryState = new HungryState(this);
        this.feedState = new FeedState(this);
        this.sickState = new SickState(this);
        this.sleepState = new SleepState(this);
        this.powerOffState = new PowerOffState(this);
        state = wakeUpState;
    }

    public void changeState(DummagotchiState dummagotchiState) {
        switch (dummagotchiState) {
            case WAKE_UP:
                state = wakeUpState;
                break;
            case JOY:
                state = joyState;
                break;
            case PLAY:
                state = playState;
                break;
            case HUNGRY:
                state = hungryState;
                break;
            case FEED:
                state = feedState;
                break;
            case SICK:
                state = sickState;
                break;
            case SLEEP:
                state = sleepState;
                break;
            case POWER_OFF:
                state = powerOffState;
                break;
        }
        state.handleRequest();
    }


}
