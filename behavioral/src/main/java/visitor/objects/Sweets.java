package visitor.objects;

import lombok.Getter;
import visitor.enums.Category;
import visitor.visitors.Visitor;

/**
 * Created by 3len1 on 2/8/2019.
 */
@Getter
public class Sweets implements Visitable {
    private static final String MSG = "Sweet and chocolate have the best taste and make us happy " +
            "but they are UNHEALTHY and have many fat";
    private int calories;
    private Category category;
    private String message;

    public Sweets() {
        this.calories = 520;
        this.category = Category.VEGETARIAN;
        this.message = MSG;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

