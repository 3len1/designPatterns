package visitor.visitors;

import javaslang.control.Try;
import visitor.enums.Category;
import visitor.exceptions.NotAccessibleElementException;
import visitor.exceptions.NotSuchElementException;
import visitor.objects.*;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Created by 3len1 on 2/11/2019.
 */
public class RecommendedVisitor implements Visitor {
    private boolean isFroVegan = true;
    private boolean isForVegeterian = true;

    @Override
    public void visit(Meal meal) {
        System.out.println(meal.getClass().getSimpleName() + " is recommended to " +
                recommended(meal.getFoods()).getDescription() + ".");
    }

    @Override
    public void visit(AlcoholicBeverages alcoholicBeverages) {
        printMessage(alcoholicBeverages);

    }

    @Override
    public void visit(Cereals cereals) {
        printMessage(cereals);

    }

    @Override
    public void visit(DairyFoods dairyFoods) {
        printMessage(dairyFoods);

    }

    @Override
    public void visit(Eggs eggs) {
        printMessage(eggs);

    }

    @Override
    public void visit(FishSeafood fishSeafood) {
        printMessage(fishSeafood);

    }

    @Override
    public void visit(Fruits fruits) {
        printMessage(fruits);

    }

    @Override
    public void visit(Legumes legumes) {
        printMessage(legumes);

    }

    @Override
    public void visit(Nuts nuts) {
        printMessage(nuts);

    }

    @Override
    public void visit(OliveOil oliveOil) {
        printMessage(oliveOil);

    }

    @Override
    public void visit(Poultry poultry) {
        printMessage(poultry);

    }

    @Override
    public void visit(RedMeat redMeat) {
        printMessage(redMeat);

    }

    @Override
    public void visit(Sweets sweets) {
        printMessage(sweets);

    }

    @Override
    public void visit(Vegetables vegetables) {
        printMessage(vegetables);
    }

    private void printMessage(Visitable v) {
        System.out.println(v.getClass().getSimpleName() + " is recommended to " +
                getCategory(v).getDescription() + ".");
    }

    private Category getCategory(Visitable v) {
        AtomicReference<Category> category = new AtomicReference<>();
        String fieldName = "category";
        Try.of(() -> v.getClass().getDeclaredField(fieldName)
        ).onSuccess(f ->
                Try.run(() -> {
                    f.setAccessible(true);
                    category.set((Category) f.get(v));
                }).getOrElseThrow(() -> new NotAccessibleElementException("Field " + fieldName +
                        "is not accessible at " + v.getClass().getSimpleName() + " class."))
        ).getOrElseThrow(() -> new NotSuchElementException("Field " + fieldName +
                "is not exist at " + v.getClass().getSimpleName() + " class."));
        return category.get();
    }

    private Category recommended(List<Visitable> visitableList) {
        visitableList.forEach(v -> {
            Category category = getCategory(v);
            if (category == Category.REGULAR) {
                isForVegeterian = false;
                isFroVegan = false;
            } else if (category == Category.VEGETARIAN)
                isFroVegan = false;
        });
        if (isFroVegan)
            return Category.VEGAN;
        else if (isForVegeterian)
            return Category.VEGETARIAN;
        return Category.REGULAR;
    }
}
