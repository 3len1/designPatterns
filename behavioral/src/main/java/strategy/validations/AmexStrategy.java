package strategy.validations;

import strategy.enums.CreditCardType;
import strategy.objects.CreditCard;

import java.time.Instant;

/**
 * Created by 3len1 on 2/7/2019.
 */
public class AmexStrategy extends ValidationStrategy {

    private static final int VALID_AMEX_CARD_DIGIT_LENGTH = 15;
    private static final String VALID_AMEX_CARD_PREFIX = "34";
    private static final String VALID_AMEX_CARD_PREFIX_2 = "37";

    @Override
    public boolean isValid(CreditCard creditCard) {
        return !hasExpire(creditCard.getExpireDate()) &&
                hasCorrectType(creditCard.getType()) &&
                hasCorrectPrefix(creditCard.getNumber()) &&
                hasCorrectLength(creditCard.getNumber()) &&
                passesLuhn(creditCard.getNumber());
    }

    private boolean hasExpire(Instant expireDate) {
        return Instant.now().compareTo(expireDate) > 0;
    }

    private boolean hasCorrectType(CreditCardType type) {
        return type == CreditCardType.AMERICAN_EXPRESS;
    }

    private boolean hasCorrectPrefix(String creditCardNumber) {
        return creditCardNumber.startsWith(VALID_AMEX_CARD_PREFIX) || creditCardNumber.startsWith(VALID_AMEX_CARD_PREFIX_2);
    }

    private boolean hasCorrectLength(String creditCardNumber) {
        return creditCardNumber.length() == VALID_AMEX_CARD_DIGIT_LENGTH;
    }
}
