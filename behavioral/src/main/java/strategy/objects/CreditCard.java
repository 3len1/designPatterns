package strategy.objects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import strategy.enums.CreditCardType;
import strategy.utils.DateUtils;
import strategy.validations.ValidationStrategy;

import java.time.Instant;

/**
 * Created by 3len1 on 2/7/2019.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreditCard {
    private String owner;
    private String number;
    private String cvv;
    private Instant expireDate;
    private CreditCardType type;
    private ValidationStrategy cardValidator;

    public CreditCard(ValidationStrategy cardValidator) {
        this.cardValidator = cardValidator;
    }

    public boolean isValid() {
        return cardValidator.isValid(this);
    }

    @Override
    public String toString() {
        return "CreditCard[" +
                "owner='" + owner + '\'' +
                ", number='" + number + '\'' +
                ", cvv='" + cvv + '\'' +
                ", expireDate=" + DateUtils.getStringFromInstant(expireDate) +
                ", type=" + type +
                ']';
    }
}
