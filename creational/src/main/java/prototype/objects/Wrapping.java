package prototype.objects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import prototype.enums.Color;

/**
 * Created by 3len1 on 1/28/2019.
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
public class Wrapping implements Cloneable {

    private String material;
    private Color color;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
