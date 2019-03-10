package abstractFactory.factory;

import abstractFactory.enums.CardType;
import abstractFactory.objects.GameCard;
import abstractFactory.objects.WizardCard;
import abstractFactory.objects.WizardExtremeCard;

/**
 * Created by 3len1 on 1/30/2019.
 */
public class WizardFactory extends GameCardFactory {
    @Override
    public GameCard getCard(CardType cardType) {
        if (cardType.getValue())
            return new WizardExtremeCard();
        return new WizardCard();
    }
}
