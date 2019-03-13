package decorator.addons;

import decorator.beverages.Beverage;
import decorator.enums.BeverageType;
import decorator.exceptions.NotInitialized;
import lombok.Getter;

import java.math.BigDecimal;

/**
 * Created by 3len1 on 3/13/2019.
 */
public abstract class Decorator extends Beverage {

    @Getter
    Beverage beverage;

    @Override
    public BeverageType getBeverageType() {
        if (beverage != null)
            return beverage.getBeverageType();
        throw new NotInitialized(BeverageType.class, "Beverage must initialized to get the type of it");
    }

    public abstract String getDescription();

    public abstract BigDecimal getPrice();

    public abstract String print();

}
