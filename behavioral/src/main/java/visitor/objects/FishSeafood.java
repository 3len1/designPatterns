package visitor.objects;

import lombok.Getter;
import visitor.enums.Category;
import visitor.visitors.Visitor;

/**
 * Created by 3len1 on 2/8/2019.
 */
@Getter
public class FishSeafood implements Visitable {
    private static final String MSG = "Fish are very efficient for our health, " +
            "also they have a nice toast and low calories.";
    private int calories;
    private Category category;
    private String message;

    public FishSeafood() {
        this.calories = 80;
        this.category = Category.REGULAR;
        this.message = MSG;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

