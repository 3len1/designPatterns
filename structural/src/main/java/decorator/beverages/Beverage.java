package decorator.beverages;

import decorator.enums.BeverageType;
import lombok.ToString;

import java.math.BigDecimal;

/**
 * Created by 3len1 on 3/12/2019.
 */
@ToString
public abstract class Beverage {

    public String description;
    public BeverageType beverageType;
    public BigDecimal price;

    public abstract BeverageType getBeverageType();

    public abstract String getDescription();

    public abstract BigDecimal getPrice();

    public abstract String print();
}
