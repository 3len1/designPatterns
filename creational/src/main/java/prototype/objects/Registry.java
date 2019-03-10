package prototype.objects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import prototype.enums.Color;
import prototype.enums.GameType;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by 3len1 on 1/28/2019.
 */
public class Registry {

    public static final String GAME = "game";
    public static final String TECHNO = "technological_product";
    private static final Logger LOGGER = LoggerFactory.getLogger(Registry.class);
    private Map<String, Product> products = new HashMap<>();

    public Registry() {
        loadProducts();
//        LOGGER.debug("GAME: " + products.get(GAME).toString());
//        LOGGER.debug("TECHNOLOGY: " + products.get(TECHNO).toString());
    }

    public Product createProduct(String type) {
        Product Product = null;

        try {
            Product = (Product) (products.get(type)).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return Product;
    }

    private void loadProducts() {

        Game game = new Game();
        game.setTittle("Game's name");
        game.setType(GameType.UNKNOWN);
        game.setName(GAME);
        game.setPrice(BigDecimal.ZERO);
        Wrapping gameWrapping = new Wrapping("box", Color.UNKNOWN);
        game.setWrapping(gameWrapping);
        products.put(game.getName(), game);

        Technology technology = new Technology();
        technology.setModel("model");
        technology.setDescription("simple description");
        technology.setName(TECHNO);
        technology.setPrice(BigDecimal.ZERO);
        Wrapping technoWrapping = new Wrapping("box", Color.UNKNOWN);
        technology.setWrapping(technoWrapping);
        products.put(technology.getName(), technology);
    }
}
