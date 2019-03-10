package visitor.visitors;

import visitor.objects.*;

/**
 * Created by 3len1 on 2/8/2019.
 */
public class DisplayVisitor implements Visitor {
    @Override
    public void visit(Meal meal) {
        System.out.println(meal.getMessage());
    }

    @Override
    public void visit(AlcoholicBeverages alcoholicBeverages) {
        System.out.println(alcoholicBeverages.getMessage());
    }

    @Override
    public void visit(Cereals cereals) {
        System.out.println(cereals.getMessage());
    }

    @Override
    public void visit(DairyFoods dairyFoods) {
        System.out.println(dairyFoods.getMessage());
    }

    @Override
    public void visit(Eggs eggs) {
        System.out.println(eggs.getMessage());
    }

    @Override
    public void visit(FishSeafood fishSeafood) {
        System.out.println(fishSeafood.getMessage());
    }

    @Override
    public void visit(Fruits fruits) {
        System.out.println(fruits.getMessage());
    }

    @Override
    public void visit(Legumes legumes) {
        System.out.println(legumes.getMessage());
    }

    @Override
    public void visit(Nuts nuts) {
        System.out.println(nuts.getMessage());
    }

    @Override
    public void visit(OliveOil oliveOil) {
        System.out.println(oliveOil.getMessage());
    }

    @Override
    public void visit(Poultry poultry) {
        System.out.println(poultry.getMessage());
    }

    @Override
    public void visit(RedMeat redMeat) {

    }

    @Override
    public void visit(Sweets sweets) {
        System.out.println(sweets.getMessage());
    }

    @Override
    public void visit(Vegetables vegetables) {
        System.out.println(vegetables.getMessage());
    }
}
