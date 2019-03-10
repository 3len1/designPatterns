package visitor.objects;

import lombok.Getter;
import visitor.enums.Category;
import visitor.visitors.Visitor;

/**
 * Created by 3len1 on 2/8/2019.
 */
@Getter
public class DairyFoods implements Visitable {
    private static final String MSG = "Milk products with low fat are better for your health. " +
            "Also avoid the milk in your coffee.";
    private int calories;
    private Category category;
    private String message;

    public DairyFoods() {
        this.calories = 123;
        this.category = Category.VEGETARIAN;
        this.message = MSG;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
