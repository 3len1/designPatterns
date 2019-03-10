package abstractFactory.factory;

import abstractFactory.enums.CardType;
import abstractFactory.enums.GameName;
import abstractFactory.objects.GameCard;

/**
 * Created by 3len1 on 1/30/2019.
 */
public abstract class GameCardFactory {

    public static GameCardFactory getCreditCardFactory(GameName game) {
        switch (game) {
            case TICHU:
                return new TichuFactory();
            case UNO:
                return new UnoFactory();
            case WIZARD:
                return new WizardFactory();
            default:
                throw new RuntimeException("Game " + game + " is not supported");
        }

    }

    public abstract GameCard getCard(CardType cardType);
}
