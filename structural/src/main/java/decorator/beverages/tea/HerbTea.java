package decorator.beverages.tea;

import decorator.enums.BeverageType;
import decorator.enums.Heat;

import java.math.BigDecimal;

/**
 * Created by 3len1 on 3/13/2019.
 */
public class HerbTea extends Tea {
    private static String DESCRIPTION_INIT = "Herb tea";
    private static BigDecimal PRICE_INIT = new BigDecimal(2.00);

    public HerbTea(Heat heat) {
        this.beverageType = BeverageType.TEA;
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
