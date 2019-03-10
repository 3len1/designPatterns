package visitor.objects;

import lombok.Getter;
import visitor.enums.Category;
import visitor.visitors.Visitor;

/**
 * Created by 3len1 on 2/8/2019.
 */
@Getter
public class Vegetables implements Visitable {
    private static final String MSG = "vegetables are very nutritious and fat burning foods.";
    private int calories;
    private Category category;
    private String message;

    public Vegetables() {
        this.calories = 30;
        this.category = Category.VEGAN;
        this.message = MSG;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

