package visitor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import visitor.objects.*;
import visitor.visitors.CalorieVisitor;
import visitor.visitors.DisplayVisitor;
import visitor.visitors.RecommendedVisitor;

/**
 * Created by 3len1 on 2/8/2019.
 */
public class VisitorDemo {
    private static final Logger LOGGER = LoggerFactory.getLogger(VisitorDemo.class);

    public static void main(String args[]) {
        LOGGER.info("Visitor example with food. Have fun to try it!");
        LOGGER.info("Add and remove food form meal to check it out.\n");

        //Initialize food
        AlcoholicBeverages alcoholicBeverages = new AlcoholicBeverages();
        Cereals cereals = new Cereals();
        DairyFoods dairyFoods = new DairyFoods();
        Eggs eggs = new Eggs();
        FishSeafood fishSeafood = new FishSeafood();
        Fruits fruits = new Fruits();
        Legumes legumes = new Legumes();
        Nuts nuts = new Nuts();
        OliveOil oliveOil = new OliveOil();
        Poultry poultry = new Poultry();
        RedMeat redMeat = new RedMeat();
        Sweets sweets = new Sweets();
        Vegetables vegetables = new Vegetables();

        //Comment and uncomment line to customize the meal
        Meal meal = new Meal();
//        meal.addFood(alcoholicBeverages);
        meal.addFood(cereals);
//        meal.addFood(dairyFoods);
//        meal.addFood(eggs);
//        meal.addFood(fishSeafood);
        meal.addFood(fruits);
//        meal.addFood(legumes);
//        meal.addFood(nuts);
//        meal.addFood(oliveOil);
//        meal.addFood(poultry);
//        meal.addFood(redMeat);
//        meal.addFood(sweets);
//        meal.addFood(vegetables);


        meal.accept(new DisplayVisitor());
        System.out.println();
        LOGGER.info("Check out Calories calculator.");
        meal.accept(new CalorieVisitor());
        System.out.println();
        LOGGER.info("Check out recommendation.");
        meal.accept(new RecommendedVisitor());


    }


}
