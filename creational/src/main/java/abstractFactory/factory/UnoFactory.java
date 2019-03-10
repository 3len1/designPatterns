package abstractFactory.factory;

import abstractFactory.enums.CardType;
import abstractFactory.objects.GameCard;
import abstractFactory.objects.UnoCard;
import abstractFactory.objects.UnoExtremeCard;

/**
 * Created by 3len1 on 1/30/2019.
 */
public class UnoFactory extends GameCardFactory {
    @Override
    public GameCard getCard(CardType cardType) {
        if (cardType.getValue())
            return new UnoExtremeCard();
        return new UnoCard();
    }
}
