package flyweight.objects;

import flyweight.enums.Color;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.UUID;

/**
 * Created by 3len1 on 4/15/2019.
 */
@Getter
@ToString
@AllArgsConstructor
public class Item {
    private final UUID itemId;
    private final Product product;
    private final Color color;

    public String print() {
        return "Item id: " + itemId +
                "\ncolor: " + color.getName() +
                "\n" + product.print();
    }
}
