package decorator.beverages.tea;

import decorator.beverages.Beverage;
import decorator.enums.BeverageType;
import decorator.enums.Heat;

import java.math.BigDecimal;

/**
 * Created by 3len1 on 3/13/2019.
 */
public abstract class Tea extends Beverage {

    Heat heat;

    @Override
    public BeverageType getBeverageType() {
        return beverageType != null ? beverageType : BeverageType.TEA;
    }

    @Override
    public String print() {
        return beverageType.getString() + ": " +
                description +
                "\nprice = " + price +
                "\nheat = " + heat.getString();
    }

    public abstract String getDescription();

    public abstract BigDecimal getPrice();

    public abstract Heat getHeat();
}
