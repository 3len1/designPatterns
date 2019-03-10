package prototype.objects;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

/**
 * Created by 3len1 on 1/28/2019.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
public abstract class Product implements Cloneable {

    private String name;
    private BigDecimal price;
    private Wrapping wrapping;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //Remove comment below for deep clone
//        this.wrapping = (Wrapping)this.wrapping.clone();
        return super.clone();
    }
}
