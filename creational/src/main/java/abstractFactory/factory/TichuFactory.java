package abstractFactory.factory;

import abstractFactory.enums.CardType;
import abstractFactory.objects.GameCard;
import abstractFactory.objects.TichuCard;
import abstractFactory.objects.TichuExtremeCard;

/**
 * Created by 3len1 on 1/30/2019.
 */
public class TichuFactory extends GameCardFactory {
    @Override
    public GameCard getCard(CardType cardType) {
        if (cardType.getValue())
            return new TichuExtremeCard();
        return new TichuCard();
    }
}
