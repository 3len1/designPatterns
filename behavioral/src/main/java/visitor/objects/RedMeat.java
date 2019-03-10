package visitor.objects;

import lombok.Getter;
import visitor.enums.Category;
import visitor.visitors.Visitor;

/**
 * Created by 3len1 on 2/8/2019.
 */
@Getter
public class RedMeat implements Visitable {
    private static final String MSG = "Meat has more fat than chicken but it is nutritious.";
    private int calories;
    private Category category;
    private String message;

    public RedMeat() {
        this.calories = 300;
        this.category = Category.REGULAR;
        this.message = MSG;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

