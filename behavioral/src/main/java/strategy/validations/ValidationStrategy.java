package strategy.validations;

import strategy.objects.CreditCard;

/**
 * Created by 3len1 on 2/7/2019.
 */
public abstract class ValidationStrategy {

    public abstract boolean isValid(CreditCard creditCard);

    // Luhn algorithm
    protected boolean passesLuhn(String ccNumber) {
        int sum = 0;
        boolean alternate = false;
        for (int i = ccNumber.length() - 1; i >= 0; i--) {
            int n = Integer.parseInt(ccNumber.substring(i, i + 1));
            if (alternate) {
                n *= 2;
                if (n > 9) {
                    n = (n % 10) + 1;
                }
            }
            sum += n;
            alternate = !alternate;
        }
        return (sum % 10 == 0);
    }
}
