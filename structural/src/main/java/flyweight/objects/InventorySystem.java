package flyweight.objects;

import flyweight.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by 3len1 on 4/22/2019.
 */
public class InventorySystem {
    private final Registry registry = new Registry();
    private final List<Item> items = new ArrayList<>();

    public void generateItem(String name, UUID itemId, Color color) {
        Product product = registry.lookup(name);
        Item item = new Item(itemId, product, color);
        items.add(item);
    }

    public String statistics() {
        return "\nTotal products created: " +
                registry.totalProductsMade() +
                "\nTotal items created: " +
                items.size();
    }

    public String itemsReport() {
        StringBuilder builder = new StringBuilder();
        builder.append("Items report\n_________________________________________\n");
        items.forEach(item ->
                builder.append(item.print()).append("\n")
        );
        builder.append("Total items:").append(items.size()).append("\n");
        return builder.toString();
    }

    public String productsReport() {
        StringBuilder builder = new StringBuilder();
        builder.append("Products report\n_________________________________________\n");
        registry.getAllProducts().forEach(product ->
                builder.append(product.print()).append("\n")
        );
        builder.append("Total products:").append(registry.totalProductsMade()).append("\n");
        return builder.toString();
    }


}
