package templateMethod;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import templateMethod.enums.Name;
import templateMethod.objects.OrderTemplate;
import templateMethod.objects.Person;
import templateMethod.objects.StoreOrder;
import templateMethod.objects.WebOrder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by 3len1 on 2/4/2019.
 */
public class TemplateMethodDemo {

    private static final Logger LOGGER = LoggerFactory.getLogger(TemplateMethodDemo.class);
    private static final int MIN_AGE = 18;
    private static final int MAX_AGE = 85;

    public static void main(String args[]) {
        LOGGER.info("Template method examples one with people and one with orders. Have fun to try it!\n");

        System.out.println();
        LOGGER.info("Person example - generate 10 random people and short them by age");
        Random r = new Random();
        List<Person> people = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            people.add(new Person(r.nextInt(MAX_AGE - MIN_AGE) + MIN_AGE, Name.getRandomName().toString()));
        }
        Collections.sort(people);
        printContents(people);
        System.out.println("\n");

        LOGGER.info("Order example - Process is different between web order and store order");
        LOGGER.info("Web Order process:");
        OrderTemplate webOrder = new WebOrder();
        webOrder.processOrder();
        System.out.println();
        LOGGER.info("Store Order process:");
        OrderTemplate storeOrder = new StoreOrder();
        storeOrder.processOrder();

    }

    private static void printContents(List<Person> people) {
        for (Person person : people) {
            System.out.println(person.toString());
        }
    }
}
