package visitor.objects;

import visitor.visitors.Visitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by 3len1 on 2/8/2019.
 */
public class Meal implements Visitable {
    private static final String MSG = "I am hungry my belly need food... Omm nomm nomm ^.^";
    private String message;
    private List<Visitable> parts = new ArrayList<>();

    public Meal() {
        this.message = MSG;
    }

    public void addFood(Visitable food) {
        parts.add(food);
    }

    public List<Visitable> getFoods() {
        return Collections.unmodifiableList(parts);
    }

    public String getMessage() {
        return message;
    }

    @Override
    public void accept(Visitor visitor) {
        for (Visitable food : parts) {
            food.accept(visitor);
        }
        visitor.visit(this);
    }
}
