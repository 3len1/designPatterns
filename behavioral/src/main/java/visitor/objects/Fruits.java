package visitor.objects;

import lombok.Getter;
import visitor.enums.Category;
import visitor.visitors.Visitor;

/**
 * Created by 3len1 on 2/8/2019.
 */
@Getter
public class Fruits implements Visitable {
    private static final String MSG = "Fruit have vitamins and are very good for your health. " +
            "There are many fruit with different taste but all of them are kind sweet. =)";
    private int calories;
    private Category category;
    private String message;

    public Fruits() {
        this.calories = 45;
        this.category = Category.VEGAN;
        this.message = MSG;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

