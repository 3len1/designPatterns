package visitor.objects;

import lombok.Getter;
import visitor.enums.Category;
import visitor.visitors.Visitor;

/**
 * Created by 3len1 on 2/8/2019.
 */
@Getter
public class Cereals implements Visitable {
    private static final String MSG = "The cereals are better to be whole grain.";
    private int calories;
    private Category category;
    private String message;

    public Cereals() {
        this.calories = 389;
        this.category = Category.VEGAN;
        this.message = MSG;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

