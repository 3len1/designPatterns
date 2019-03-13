package decorator.beverages.coffee;

import decorator.beverages.Beverage;
import decorator.enums.BeverageType;

import java.math.BigDecimal;

/**
 * Created by 3len1 on 3/13/2019.
 */
public class Decaf extends Beverage {

    private static String DESCRIPTION_INIT = "Decaf coffee";
    private static BigDecimal PRICE_INIT = new BigDecimal(2.00);

    public Decaf() {
        beverageType = BeverageType.COFFEE;
        description = DESCRIPTION_INIT;
        price = PRICE_INIT;
    }

    @Override
    public BeverageType getBeverageType() {
        return beverageType != null ? beverageType : BeverageType.COFFEE;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String print() {
        return beverageType.getString() + ": " +
                description +
                "\nprice = " + price;
    }
}