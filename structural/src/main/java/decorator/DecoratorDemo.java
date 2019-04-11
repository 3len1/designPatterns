package decorator;

import decorator.addons.*;
import decorator.beverages.chocolates.Bueno;
import decorator.beverages.chocolates.Cookie;
import decorator.beverages.chocolates.WhiteChocolate;
import decorator.beverages.coffee.DarkRoast;
import decorator.beverages.coffee.Espresso;
import decorator.beverages.coffee.Freddo;
import decorator.beverages.coffee.HouseBlend;
import decorator.beverages.tea.BlackTea;
import decorator.beverages.tea.GreenTea;
import decorator.enums.Flavor;
import decorator.enums.FruitName;
import decorator.enums.Heat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by 3len1 on 3/12/2019.
 */
public class DecoratorDemo {
    private static final Logger LOGGER = LoggerFactory.getLogger(DecoratorDemo.class);

    public static void main(String args[]) {
        LOGGER.info("Decorator example with beverages. Have fun to try it!\n");
        LOGGER.info("There are more options, using constructors");

        System.out.println();
        System.out.println((new Espresso()).print() + "\n");
        System.out.println((new WhiteChocolate(Heat.HOT)).print() + "\n");
        System.out.println((new Mocha(new HouseBlend())).print() + "\n");
        System.out.println((new Crumble(new Cookie(Heat.HOT))).print() + "\n");
        System.out.println((new Fruit(new GreenTea(Heat.COLD), FruitName.LIME)).print() + "\n");
        System.out.println((new FlavorSyrup(new DarkRoast(), Flavor.CARAMEL)).print() + "\n");
        System.out.println((new FlavorSyrup(new Milk(new Freddo()), Flavor.CARAMEL)).print() + "\n");
        System.out.println((new IceCream(new Whip(new Bueno(Heat.COLD)), Flavor.CHOCOLATE)).print() + "\n");
        System.out.println((new FlavorSyrup(new Whip(new Espresso()), Flavor.CHOCOLATE)).print() + "\n");
        System.out.println((new Fruit(new FlavorSyrup(new BlackTea(Heat.COLD), Flavor.CARAMEL),
                FruitName.BERRIES)).print());

    }
}
