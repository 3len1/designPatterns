package command;

import command.commands.*;
import command.objects.Task;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by 3len1 on 1/31/2019.
 */
public class CommandDemo {

    private static final Logger LOGGER = LoggerFactory.getLogger(CommandDemo.class);

    private static final String STUDYING = "Studying improves our skills";
    private static final String CLEANING = "Cleaning and organizing";
    private static final String EXERCISING = "Activities make us happier";
    private static final String CUDDLING = "Spread love and hugs all around";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a lesson for study: ");
        Task study = new Task(STUDYING, scanner.nextLine());
        System.out.println("Enter a place which need cleaning: ");
        Task clean = new Task(CLEANING, scanner.nextLine());
        Task gym = new Task(EXERCISING);
        Task hug = new Task(CUDDLING);

        List<Task> allTasks = Arrays.asList(study, gym, clean, hug);
        debug("Initialized data", allTasks);

        Command doStudy = new DoCommand(study);
        doStudy.describe();
        doStudy.execute();

        Command doCuddle = new DoCommand(hug);
        doCuddle.describe();
        doCuddle.execute();
        debug("Check DoCommand\n Let's do study & hugs", allTasks);

        Command doThemAll = new CheckAllCommand(allTasks);
        doThemAll.execute();
        debug("Check CheckAllCommand\n Everything is done", allTasks);

        Command undoClean = new UndoCommand(clean);
        undoClean.describe();
        undoClean.execute();
        debug("Check UndoCommand\n Place get dirty", allTasks);

        Command undoThemAll = new UncheckAllCommand(allTasks);
        undoThemAll.execute();
        debug("Check UncheckAllCommand\n No we got to do them all again", allTasks);
    }

    private static void debug(String debugMsg, List<Task> tasks) {
        LOGGER.debug(debugMsg);
        tasks.forEach(t -> LOGGER.debug(t.toString()));
    }
}
