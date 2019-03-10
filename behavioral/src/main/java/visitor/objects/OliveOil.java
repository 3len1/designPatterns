package visitor.objects;

import lombok.Getter;
import visitor.enums.Category;
import visitor.visitors.Visitor;

/**
 * Created by 3len1 on 2/8/2019.
 */
@Getter
public class OliveOil implements Visitable {
    private static final String MSG = "Olive oil might have 884 calories per 100gr " +
            "so that we have to use only a spoon.";
    private int calories;
    private Category category;
    private String message;

    public OliveOil() {
        this.calories = 884;
        this.category = Category.VEGAN;
        this.message = MSG;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
