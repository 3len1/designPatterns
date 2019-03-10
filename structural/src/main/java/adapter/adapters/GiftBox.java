package adapter.adapters;

import adapter.enums.Color;
import adapter.enums.Element;
import adapter.enums.Level;
import adapter.objects.Craft;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by 3len1 on 2/12/2019.
 */
public class GiftBox {
    private static final Logger LOGGER = LoggerFactory.getLogger(GiftBox.class);
    private Scanner scanner = new Scanner(System.in);

    private Craft craft;


    public Craft getCraft() {
        LOGGER.info("Create a craft");
        craft = new Craft();
        System.out.println("Enter craft's tittle:");
        craft.setTittle(scanner.nextLine());
        System.out.println("Enter craft's description:");
        craft.setDescription(scanner.nextLine());
        craft.setElements(Arrays.asList(Element.BOX, Element.CARDBOARD, Element.FLUFF_BALLS, Element.RIBBON));
        craft.setColors(get3Colors());
        craft.setLevel(Level.HARD);
        return craft;
    }

    private List<Color> get3Colors() {
        System.out.println("Available Colors [" + Arrays.asList(Color.values()));
        List<Color> colors = new ArrayList<>();
        System.out.println("Enter 1st color number");
        colors.add(Color.fromId(scanner.nextInt()));
        scanner.nextLine();
        System.out.println("Enter 2nd color number");
        colors.add(Color.fromId(scanner.nextInt()));
        scanner.nextLine();
        System.out.println("Enter 3rd color number");
        colors.add(Color.fromId(scanner.nextInt()));
        scanner.nextLine();
        return colors;
    }
}
