package singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import singleton.objects.SingletonDescription;
import singleton.objects.SingletonObject;

import java.util.Scanner;

/**
 * Created by 3len1 on 1/28/2019.
 */
public class SigletonDemo {
    private static final Logger LOGGER = LoggerFactory.getLogger(SigletonDemo.class);

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        LOGGER.info("Singleton example with and without description. Have fun to try it!\n");

        SingletonObject singletonObj1 = SingletonObject.getInstance();
        LOGGER.info(singletonObj1.toString());

        SingletonObject singletonObj2 = SingletonObject.getInstance();
        LOGGER.info(singletonObj2.toString());

        if (singletonObj1.equals(singletonObj2))
            LOGGER.info("The tow states are equal: \n Obj 1 -> [" + singletonObj1.getUuid().toString() +
                    "] \nObj 2 -> [" + singletonObj2.getUuid().toString() + "]");

        System.out.println("Enter a text: ");
        String description = scanner.nextLine();
        SingletonDescription singletonObj3 = SingletonDescription.getInstance(description);
        LOGGER.info(singletonObj3.toString());
        LOGGER.debug("Obj 3 -> [" + singletonObj3.getUuid().toString() +
                "] with description (" + singletonObj3.getDescription() + ")");

        System.out.println("Enter a text: ");
        description = scanner.nextLine();
        SingletonDescription singletonObj4 = SingletonDescription.getInstance(description);
        LOGGER.info(singletonObj4.toString());

        if (singletonObj3.equals(singletonObj4))
            LOGGER.info("The tow states are equal: \n Obj 3 -> [" + singletonObj3.getUuid().toString() +
                    "] with description (" + singletonObj3.getDescription() +
                    ") \nObj 4 -> [" + singletonObj4.getUuid().toString() +
                    "] with description (" + singletonObj3.getDescription() + ")");

    }

}
