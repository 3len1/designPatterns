package command.commands;

import command.objects.Task;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Scanner;

/**
 * Created by 3len1 on 1/31/2019.
 */
@NoArgsConstructor
@AllArgsConstructor
public class CheckAllCommand implements Command {
    List<Task> tasks;

    @Override
    public void execute() {
        for (Task task : tasks) {
            if (!task.getDone()) {
                task.toggle();
            }
        }
    }

    @Override
    public void describe() {
        for (Task task : tasks) {
            System.out.println("Enter description for task \"" + task.getTittle() + "\":");
            task.setDescription((new Scanner(System.in)).nextLine());
        }
    }
}
