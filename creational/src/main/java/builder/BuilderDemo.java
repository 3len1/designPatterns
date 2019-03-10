package builder;

import builder.objects.User;
import builder.objectsBuilders.UserBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

/**
 * Created by 3len1 on 1/25/2019.
 */
public class BuilderDemo {
    private static final Logger LOGGER = LoggerFactory.getLogger(BuilderDemo.class);

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        LOGGER.info("Builder example with User object. Have fun to try it!\n");

        System.out.println("Enter username: ");
        String username = scanner.nextLine();
        System.out.println("Enter password: ");
        String password = scanner.nextLine();
        System.out.println("Enter email: ");
        String email = scanner.nextLine();
        System.out.println("Enter first name: ");
        String firstname = scanner.nextLine();
        System.out.println("Enter last name: ");
        String lastname = scanner.nextLine();
        System.out.println("Enter age: ");
        int age = scanner.nextInt();
        User user = UserBuilder.getUserBuilder(username, password)
                .withEmail(email)
                .withProfile(firstname, lastname, age)
                .build();

        LOGGER.info(user.toString());
    }

}
