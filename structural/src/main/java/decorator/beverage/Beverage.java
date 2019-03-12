package decorator.beverage;

import decorator.enums.BeverageType;

/**
 * Created by 3len1 on 3/12/2019.
 */
public abstract class Beverage {

    public abstract BeverageType getBeverageType();
    public abstract String getDescription() ;
    public abstract Double getPrice();
}
