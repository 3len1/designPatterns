package decorator.beverages.chocolates;

import decorator.enums.BeverageType;
import decorator.enums.Heat;

import java.math.BigDecimal;

/**
 * Created by 3len1 on 3/13/2019.
 */
public class MilkChocolate extends Chocolate {

    private static String DESCRIPTION_INIT = "Milk chocolate";
    private static BigDecimal PRICE_INIT = new BigDecimal(2.50);

    public MilkChocolate(Heat heat) {
        this.beverageType = BeverageType.CHOCOLATE;
        this.description = DESCRIPTION_INIT;
        this.price = PRICE_INIT;
        this.heat = heat;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public BigDecimal getPrice() {
        return this.price;
    }

    @Override
    public Heat getHeat() {
        return this.heat;
    }
}
