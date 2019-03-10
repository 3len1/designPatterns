package visitor.objects;

import lombok.Getter;
import visitor.enums.Category;
import visitor.visitors.Visitor;

/**
 * Created by 3len1 on 2/8/2019.
 */
@Getter
public class Eggs implements Visitable {
    private static final String MSG = "Eggs are good for your health but it's better " +
            "to eat the white part.";
    private int calories;
    private Category category;
    private String message;

    public Eggs() {
        this.calories = 155;
        this.category = Category.VEGETARIAN;
        this.message = MSG;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

