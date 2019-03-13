package decorator.addons;

import decorator.beverages.Beverage;
import decorator.enums.BeverageType;
import decorator.exceptions.NoSupport;
import decorator.exceptions.NotInitialized;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * Created by 3len1 on 3/13/2019.
 */
public class Mocha extends Decorator {

    private static String DESCRIPTION = ", mocha";
    private static BigDecimal ADD_ON_PRICE = new BigDecimal(0.70);

    public Mocha(Beverage beverage) {
        if (beverage == null)
            throw new NotInitialized(BeverageType.class, "Decorator can't be initialize to nullable beverage");
        if (beverage.getBeverageType() == BeverageType.TEA)
            throw new NoSupport(this.getClass(), beverage.getBeverageType());
        this.beverage = beverage;
        this.description = DESCRIPTION;
        this.price = ADD_ON_PRICE;
    }

    @Override
    public String getDescription() {
        if (beverage != null)
            return beverage.getDescription() + this.description;
        throw new NotInitialized(BeverageType.class, "Beverage must initialized to get the type of it");
    }

    @Override
    public BigDecimal getPrice() {
        if (beverage != null)
            return beverage.getPrice().add(this.price);
        throw new NotInitialized(BeverageType.class, "Beverage must initialized to get the type of it");
    }

    @Override
    public String print() {
        DecimalFormat format = new DecimalFormat("##.00");
        if (beverage != null)
            return beverage.getBeverageType().getString() + ": " + this.getDescription() +
                    "\nPrice: " + format.format(this.getPrice());
        throw new NotInitialized(BeverageType.class, "Beverage must initialized to get the type of it");
    }
}
