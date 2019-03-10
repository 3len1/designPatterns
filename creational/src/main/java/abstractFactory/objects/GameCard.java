package abstractFactory.objects;

import abstractFactory.enums.Color;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by 3len1 on 1/30/2019.
 */
@Getter
@Setter
@ToString
public abstract class GameCard {
    private String cardName;
    private Integer cardNumber;
    private Color color;
    private Boolean special;
}
