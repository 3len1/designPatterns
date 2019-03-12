package composite;

import composite.enums.Emotion;
import composite.objects.PairComposite;
import composite.objects.PairLeaf;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

/**
 * Created by 3len1 on 3/11/2019.
 */
public class CompositeDemo {
    private static final Logger LOGGER = LoggerFactory.getLogger(CompositeDemo.class);

    public static void main(String args[]) {
        LOGGER.info("Composite example with emotions. Have fun to try it!\n");
        System.out.println(Emotion.printValus());
        Scanner scanner = new Scanner(System.in);

        System.out.println("Emotion is the most important in someone's life\n" +
                "Create one, by the list above by choose and number and then change line to describe it!");

        PairComposite main = new PairComposite(Emotion.fromNumber(scanner.nextInt()));
        scanner.nextLine();
        main.setDescription(scanner.nextLine());

        System.out.println("Emotions are more complex you could add more to your main (parent) one\n" +
                "Enter the number of children emotion you want to create and change line");
        int num = scanner.nextInt();
        scanner.nextLine();

        if (num == 0) {
            LOGGER.info("No child for parent pair will be created");
        }

        for (int i = 0; i < num; i++)
            main.add(createChildPair(i + 1));

        if (num > 1) {
            LOGGER.info("Check if the first tow children are equal");
            if (main.getChildPairComponents().get(0).equals(main.getChildPairComponents().get(1)))
                LOGGER.info("Child 1 [" + main.getChildPairComponents().get(0).toString().trim() + "] is equal with child 2 [" +
                        main.getChildPairComponents().get(1).toString().trim() + "].");
            else
                LOGGER.info("Child 1 [" + main.getChildPairComponents().get(0).toString().trim() + "] is not equal with child 2 [" +
                        main.getChildPairComponents().get(1).toString().trim() + "].");
        }

        System.out.println(main.toString());
    }

    public static PairLeaf createChildPair(int i) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Create " + i + " pair, by the list above by choose and number and then change line to describe it!");
        PairLeaf child = new PairLeaf(Emotion.fromNumber(scanner.nextInt()));
        scanner.nextLine();
        child.setDescription(scanner.nextLine());
        return child;
    }
}
