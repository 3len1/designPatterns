package command.commands;

import command.objects.Task;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Scanner;

/**
 * Created by 3len1 on 1/31/2019.
 */
@NoArgsConstructor
@AllArgsConstructor
public class DoCommand implements Command {
    Task task;

    @Override
    public void execute() {
        if (!task.getDone())
            task.toggle();
    }

    @Override
    public void describe() {
        System.out.println("Enter description for task \"" + task.getTittle() + "\":");
        task.setDescription((new Scanner(System.in)).nextLine());
    }
}
