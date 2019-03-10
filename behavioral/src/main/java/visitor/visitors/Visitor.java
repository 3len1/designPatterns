package visitor.visitors;

import visitor.objects.*;

/**
 * Created by 3len1 on 2/8/2019.
 */
public interface Visitor {
    void visit(Meal meal);

    void visit(AlcoholicBeverages alcoholicBeverages);

    void visit(Cereals cereals);

    void visit(DairyFoods dairyFoods);

    void visit(Eggs eggs);

    void visit(FishSeafood fishSeafood);

    void visit(Fruits fruits);

    void visit(Legumes legumes);

    void visit(Nuts nuts);

    void visit(OliveOil oliveOil);

    void visit(Poultry poultry);

    void visit(RedMeat redMeat);

    void visit(Sweets sweets);

    void visit(Vegetables vegetables);
}
