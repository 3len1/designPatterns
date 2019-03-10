package abstractFactory;

import abstractFactory.enums.CardType;
import abstractFactory.enums.Color;
import abstractFactory.enums.GameName;
import abstractFactory.factory.GameCardFactory;
import abstractFactory.objects.GameCard;
import io.vavr.control.Try;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by 3len1 on 1/30/2019.
 */
public class AbstractFactoryDemo {
    private static final Logger LOGGER = LoggerFactory.getLogger(AbstractFactoryDemo.class);

    public static void main(String[] args) {
        LOGGER.info("Abstract factory example with cards. Have fun to try it!\n");
        Scanner scanner = new Scanner(System.in);
        List<GameCard> cards = new ArrayList<>();
        System.out.println("Enter the number of cards will be created: ");
        int numberOfCards = scanner.nextInt();
        for (int i = 0; i < numberOfCards; i++)
            cards.add(createCard());

        cards.forEach(c -> LOGGER.debug("Card instance of " + c.getClass() + " \n[" + c.toString() + "]"));
    }

    private static GameCard createCard() {
        LOGGER.info("Create a card");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Available games " + Arrays.asList(GameName.values()) + " \nPick a game: ");
        GameCard card = GameCardFactory.getCreditCardFactory(Try.of(() ->
                GameName.valueOf(scanner.nextLine())).getOrElseThrow(RuntimeException::new))
                .getCard(Try.of(() -> {
                    System.out.println(CardType.EXTREME + " or " + CardType.NORMAL);
                    return CardType.valueOf(scanner.nextLine());
                }).getOrElse(CardType.NORMAL));

        System.out.println("Enter card's name:");
        card.setCardName(scanner.nextLine());
        System.out.println("Enter card's color: \nAvailable colors [" + Arrays.asList(Color.values()) + "]");
        String color = scanner.nextLine();
        card.setColor(Try.of(() -> Color.valueOf(color)).getOrElseGet(() -> Color.UNDEFINED));
        System.out.println("Is card special?");
        String boo = scanner.nextLine();
        card.setSpecial(Try.of(() -> Boolean.valueOf(boo)).getOrElse(Boolean.FALSE));
        System.out.println("Enter card's number:");
        card.setCardNumber(scanner.nextInt());
        return card;
    }
}
