package visitor.objects;

import lombok.Getter;
import visitor.enums.Category;
import visitor.visitors.Visitor;

/**
 * Created by 3len1 on 2/8/2019.
 */
@Getter
public class AlcoholicBeverages implements Visitable {
    private static final String MSG = "Drinking too much alcohol make you drunk. " +
            "If you want to avoid that drink more water.";
    private int calories;
    private Category category;
    private String message;

    public AlcoholicBeverages() {
        this.calories = 437;
        this.category = Category.VEGAN;
        this.message = MSG;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
