package visitor.objects;

import lombok.Getter;
import visitor.enums.Category;
import visitor.visitors.Visitor;

/**
 * Created by 3len1 on 2/8/2019.
 */
@Getter
public class Nuts implements Visitable {
    private static final String MSG = "Nuts have many calories but we do not eat only 20 grams.";
    private int calories;
    private Category category;
    private String message;

    public Nuts() {
        this.calories = 607;
        this.category = Category.VEGAN;
        this.message = MSG;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

