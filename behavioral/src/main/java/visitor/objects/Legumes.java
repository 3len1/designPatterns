package visitor.objects;

import lombok.Getter;
import visitor.enums.Category;
import visitor.visitors.Visitor;

/**
 * Created by 3len1 on 2/8/2019.
 */
@Getter
public class Legumes implements Visitable {
    private static final String MSG = "Legumes are a good source of iron and protein " +
            "but no one like them except vegetarians.";
    private int calories;
    private Category category;
    private String message;

    public Legumes() {
        this.calories = 81;
        this.category = Category.VEGAN;
        this.message = MSG;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

