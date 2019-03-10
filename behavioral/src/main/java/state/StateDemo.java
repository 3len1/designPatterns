package state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import state.enums.DummagotchiState;
import state.objects.Dummagotchi;

import java.util.Scanner;

/**
 * Created by 3len1 on 2/6/2019.
 */
public class StateDemo {
    private static final Logger LOGGER = LoggerFactory.getLogger(StateDemo.class);

    public static void main(String[] args) {
        LOGGER.info("State example with Dummagotchi. Have fun and play!\n");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Dummagotchi's name:");
        Dummagotchi cute = new Dummagotchi(scanner.nextLine());

        System.out.println("Choose a number from 0 to 8 to play and press enter\n" +
                "Choice 0: EXIT\n" +
                "Choice 1: WAKE_UP\n" +
                "Choice 2: JOY\n" +
                "Choice 3: PLAY\n" +
                "Choice 4: HUNGRY\n" +
                "Choice 5: FEED\n" +
                "Choice 6: SICK\n" +
                "Choice 7: SLEEP\n" +
                "Choice 8: POWER_OFF\n");
        int choice = scanner.nextInt();
        scanner.nextLine();
        while (choice != 0) {
            cute.changeState(DummagotchiState.valueOfInt(choice));
            //LOGGER.info(cute.toString());
            LOGGER.debug(cute.getBatteryLevel().toString() + "(" + cute.getBatteryLevel().getPrc() + ")");
            choice = scanner.nextInt();
            scanner.nextLine();
        }


    }
}
