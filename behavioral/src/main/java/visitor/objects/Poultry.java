package visitor.objects;

import lombok.Getter;
import visitor.enums.Category;
import visitor.visitors.Visitor;

/**
 * Created by 3len1 on 2/8/2019.
 */
@Getter
public class Poultry implements Visitable {
    private static final String MSG = "Poultry is the best meat because " +
            "it has many protein and no fat.";
    private int calories;
    private Category category;
    private String message;

    public Poultry() {
        this.calories = 239;
        this.category = Category.REGULAR;
        this.message = MSG;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
