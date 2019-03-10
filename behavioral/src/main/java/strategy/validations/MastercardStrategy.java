package strategy.validations;

import strategy.enums.CreditCardType;
import strategy.objects.CreditCard;

import java.time.Instant;

/**
 * Created by 3len1 on 2/7/2019.
 */
public class MastercardStrategy extends ValidationStrategy {
    private static final int VALID_MASTERCARD_CARD_DIGIT_LENGTH = 16;
    private static final String VALID_MASTERCARD_CARD_PREFIX = "5";

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
        return type == CreditCardType.MASTERCARD;
    }

    private boolean hasCorrectPrefix(String creditCardNumber) {
        return creditCardNumber.startsWith(VALID_MASTERCARD_CARD_PREFIX);
    }

    private boolean hasCorrectLength(String creditCardNumber) {
        return creditCardNumber.length() == VALID_MASTERCARD_CARD_DIGIT_LENGTH;
    }
}
