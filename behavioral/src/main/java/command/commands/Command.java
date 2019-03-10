package command.commands;

/**
 * Created by 3len1 on 1/31/2019.
 */
@FunctionalInterface
public interface Command {
    public void execute();

    public default void describe() {

    }
}

