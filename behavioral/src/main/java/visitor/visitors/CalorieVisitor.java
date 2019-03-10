package visitor.visitors;

import javaslang.control.Try;
import visitor.exceptions.NotAccessibleElementException;
import visitor.exceptions.NotSuchElementException;
import visitor.objects.*;

/**
 * Created by 3len1 on 2/8/2019.
 */
public class CalorieVisitor implements Visitor {
    private final int RECOMMENDED_CALORIES = 500;
    private int calories;

    @Override
    public void visit(Meal meal) {
        this.calories = 0;
        meal.getFoods().forEach(this::getCaloriesFormVisitable);
        System.out.println("The total calories for this meal is " + calories + ".");
        if (calories < RECOMMENDED_CALORIES)
            System.out.println("Well done this meal is healthy.");
        else
            System.out.println("This meal is not healthy, it need exercise to " +
                    "burn off the excess calories.");

    }

    @Override
    public void visit(AlcoholicBeverages alcoholicBeverages) {
        this.getCaloriesWithMsg(alcoholicBeverages);
    }

    @Override
    public void visit(Cereals cereals) {
        this.getCaloriesWithMsg(cereals);
    }

    @Override
    public void visit(DairyFoods dairyFoods) {
        this.getCaloriesWithMsg(dairyFoods);
    }

    @Override
    public void visit(Eggs eggs) {
        this.getCaloriesWithMsg(eggs);
    }

    @Override
    public void visit(FishSeafood fishSeafood) {
        this.getCaloriesWithMsg(fishSeafood);
    }

    @Override
    public void visit(Fruits fruits) {
        this.getCaloriesWithMsg(fruits);
    }

    @Override
    public void visit(Legumes legumes) {
        this.getCaloriesWithMsg(legumes);
    }

    @Override
    public void visit(Nuts nuts) {
        this.getCaloriesWithMsg(nuts);
    }

    @Override
    public void visit(OliveOil oliveOil) {
        this.getCaloriesWithMsg(oliveOil);
    }

    @Override
    public void visit(Poultry poultry) {
        this.getCaloriesWithMsg(poultry);
    }

    @Override
    public void visit(RedMeat redMeat) {
        this.getCaloriesWithMsg(redMeat);
    }

    @Override
    public void visit(Sweets sweets) {
        this.getCaloriesWithMsg(sweets);
    }

    @Override
    public void visit(Vegetables vegetables) {
        this.getCaloriesWithMsg(vegetables);
    }

    private void getCaloriesWithMsg(Visitable v) {
        String fieldName = "calories";
        Try.of(() -> v.getClass().getDeclaredField(fieldName)
        ).onSuccess(f ->
                Try.run(() -> {
                    f.setAccessible(true);
                    setCalories(f.getInt(v));
                }).getOrElseThrow(() -> new NotAccessibleElementException("Field " + fieldName +
                        "is not accessible at " + v.getClass().getSimpleName() + " class."))
        ).getOrElseThrow(() -> new NotSuchElementException("Field " + fieldName +
                "is not exist at " + v.getClass().getSimpleName() + " class."));
        System.out.println(v.getClass().getSimpleName() + " have " +
                calories + " calories per  100 grams.");
    }

    private void setCalories(int calories) {
        this.calories = calories;
    }

    private void addCalories(int calories) {
        this.calories = this.calories + calories;
    }

    private void getCaloriesFormVisitable(Visitable v) {
        String fieldName = "calories";
        Try.of(() -> v.getClass().getDeclaredField(fieldName)
        ).onSuccess(f ->
                Try.run(() -> {
                    f.setAccessible(true);
                    addCalories(f.getInt(v));
                }).getOrElseThrow(() -> new NotAccessibleElementException("Field " + fieldName +
                        "is not accessible at " + v.getClass().getSimpleName() + " class."))
        ).getOrElseThrow(() -> new NotSuchElementException("Field " + fieldName +
                "is not exist at " + v.getClass().getSimpleName() + " class."));
    }

}
