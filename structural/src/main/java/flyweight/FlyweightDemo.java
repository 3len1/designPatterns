package flyweight;

import flyweight.enums.Color;
import flyweight.objects.InventorySystem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Scanner;
import java.util.UUID;

/**
 * Created by 3len1 on 4/15/2019.
 */
public class FlyweightDemo {

    private static final Logger LOGGER = LoggerFactory.getLogger(FlyweightDemo.class);

    public static void main(String args[]) {
        LOGGER.info("Flyweight example with registry. Have fun to try it!");
        LOGGER.info("Gave same inputs to check that product with this name create only once, but items twice\n");

        Scanner scanner = new Scanner(System.in);
        InventorySystem invetory = new InventorySystem();
        System.out.println("Enter the number of generated items:");
        int num = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Available colors [" + Arrays.asList(Color.values()) + "]");
        for (int i = 0; i < num; i++) {
            generateItem(invetory, scanner);
        }

        LOGGER.info("Report");
        System.out.println(invetory.statistics() + "\n");
        System.out.println(invetory.itemsReport());
        System.out.println(invetory.productsReport());
    }


    private static void generateItem(InventorySystem invetory, Scanner scanner) {
        System.out.println("Enter items name:");
        String name = scanner.nextLine();
        System.out.println("Enter color id:");
        Color color = Color.fromId(scanner.nextInt());
        scanner.nextLine();
        invetory.generateItem(name, UUID.randomUUID(), color);
    }
}
