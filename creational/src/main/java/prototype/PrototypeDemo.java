package prototype;

import javaslang.control.Try;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import prototype.enums.Color;
import prototype.enums.GameType;
import prototype.objects.Game;
import prototype.objects.Registry;
import prototype.objects.Wrapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static prototype.utils.SystemUtils.scanDouble;
import static prototype.utils.SystemUtils.scanf;

/**
 * Created by 3len1 on 1/28/2019.
 */
public class PrototypeDemo {

    private static final Logger LOGGER = LoggerFactory.getLogger(PrototypeDemo.class);

    public static void main(String[] args) {
        LOGGER.info("Prototype example with products. Have fun to try it!\n");
        LOGGER.debug("Comment the setters you want to have default values\n");

        Scanner scanner = new Scanner(System.in);
        Registry registry = new Registry();

        System.out.println("_____________________________________________________________________________________");
        LOGGER.info("Register data for games");
        System.out.println("Enter the number of games: ");
        int i, num = scanner.nextInt();
        List<Game> gameList = new ArrayList<>();
        for (i = 0; i < num; i++) {
            Game game = (Game) registry.createProduct(Registry.GAME);
            LOGGER.info("Register data for game" + i);
            game.setTittle(scanf("Enter game's tittle"));
            game.setType(Try.of(() -> GameType.valueOf(
                    scanf("Enter the game's type \n[" +
                            Arrays.asList(GameType.values()) + "]"))).get());
            game.setName(scanf("Enter product's name"));
            game.setPrice(scanDouble("Enter product's price"));
            Wrapping gameWrapping = new Wrapping(scanf("Enter wrapping's material"),
                    Try.of(() -> Color.valueOf(scanf(
                            "Enter wrapping's color \n[Color values " +
                                    Arrays.asList(Color.values()) + "]"))).get());
            game.setWrapping(gameWrapping);
            gameList.add(game);
        }

//        System.out.println("_____________________________________________________________________________________");
//        LOGGER.info("Register data for technological products");
//        System.out.println("Enter the number of technological products: ");
//        num = scanner.nextInt();
//        List<Technology> technologyList = new ArrayList<>();
//        for (i = 0; i < num; i++) {
//            Technology technology = (Technology) registry.createProduct(Registry.TECHNO);
//            LOGGER.info("Register data for technological product");
//            technology.setModel(scanf("Enter product's model"));
//            technology.setDescription(scanf("Enter the products's description"));
//            technology.setName(scanf("Enter product's name"));
//            technology.setPrice(scanDouble("Enter product's price"));
//            Wrapping technoWrapping = new Wrapping(scanf("Enter wrapping's material"),
//                    Try.of(() -> Color.valueOf(scanf(
//                            "Enter wrapping's color \n[Color values " +
//                                    Arrays.asList(Color.values()) + "]"))).get());
//            technology.setWrapping(technoWrapping);
//            technologyList.add(technology);
//        }

        System.out.println("_____________________________________________________________________________________");
        gameList.forEach(g -> LOGGER.info(g.toString()));
//        technologyList.forEach(t -> LOGGER.info(t.toString()));

    }
}
