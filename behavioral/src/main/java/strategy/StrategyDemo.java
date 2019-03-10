package strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import state.StateDemo;
import strategy.enums.CreditCardType;
import strategy.objects.CreditCard;
import strategy.utils.DateUtils;
import strategy.validations.AmexStrategy;
import strategy.validations.MastercardStrategy;
import strategy.validations.VisaStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * Created by 3len1 on 2/6/2019.
 */
public class StrategyDemo {

    private static final Logger LOGGER = LoggerFactory.getLogger(StateDemo.class);


    public static void main(String[] args) {
        LOGGER.info("Strategy example with credit card validation. Have fun to try it!");
        Scanner scanner = new Scanner(System.in);
        List<CreditCard> creditCards = new ArrayList<>();
//        valid card numbers
//        AmericanExpress 379185883464283
//        Visa            4539589763663402

        System.out.println("Enter the number of cards that will be created:");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++)
            creditCards.add(createCreditCard());

        creditCards.forEach(c -> {
            LOGGER.debug(c.toString());
            System.out.println("Card " + c.getNumber() + " has type " + c.getType() +
                    "and validation is " + c.isValid());
        });

    }

    public static CreditCard createCreditCard() {
        Scanner scanner = new Scanner(System.in);
        CreditCard creditCard;
        System.out.println("Enter the type of credit card will be created: " +
                "\nOptions: [VISA(1), MASTERCARD(2), AMERICAN_EXPRESS(3)]");
        int type = scanner.nextInt();
        scanner.nextLine();
        if (type == 1) {
            creditCard = new CreditCard(new VisaStrategy());
            creditCard.setType(CreditCardType.VISA);
        } else if (type == 2) {
            creditCard = new CreditCard(new MastercardStrategy());
            creditCard.setType(CreditCardType.MASTERCARD);
        } else if (type == 3) {
            creditCard = new CreditCard(new AmexStrategy());
            creditCard.setType(CreditCardType.AMERICAN_EXPRESS);
        } else
            throw new RuntimeException("Not valid options");
        System.out.println("Enter owner's name: ");
        creditCard.setOwner(scanner.nextLine());
        System.out.println("Enter card number: ");
        creditCard.setNumber(scanner.nextLine());
        System.out.println("Enter cvv: ");
        creditCard.setCvv(scanner.nextLine());
        System.out.println("Enter  expiration date: \nFormat MM/yyyy");
        creditCard.setExpireDate(DateUtils.getInstantFromString(scanner.nextLine()));
//        LOGGER.debug(creditCard.toString());
        return creditCard;
    }
}
