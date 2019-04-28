package proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import proxy.enums.Role;
import proxy.objects.User;
import proxy.proxy.FolderProxy;

import java.util.Scanner;

/**
 * Created by 3len1 on 4/24/2019.
 */
public class ProxyDemo {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProxyDemo.class);

    public static void main(String args[]) {
        LOGGER.info("Proxy example with filesystem. Have fun to try it!\n");
        Scanner scanner = new Scanner(System.in);
        FolderProxy filesystem = new FolderProxy();
        LOGGER.info("Create admin user");
        User admin = createUser(Role.ADMIN);
        LOGGER.info("Create operator user");
        User operator = createUser(Role.OPERATOR);
        LOGGER.info("Create owner user");
        User owner = createUser(Role.OWNER);
        LOGGER.info("Create read only user");
        User readOnly = createUser(Role.READ_ONLY);

        LOGGER.info("\nAdmin has all permissions to the folder {}\n", filesystem.getFolderPath());
        filesystem.setUser(admin);
        filesystem.createFolder();
        filesystem.createFile();
        filesystem.createFile();
        filesystem.readFiles();
        System.out.println("Enter the name of file you want to delete");
        filesystem.deleteFile(scanner.nextLine());
        filesystem.executeFiles();
        filesystem.writeFiles();

        LOGGER.info("\nOwner has read and execute permissions to the folder {}\n", filesystem.getFolderPath());
        filesystem.setUser(operator);
        filesystem.readFiles();
        filesystem.executeFiles();

        LOGGER.info("\nOwner has read and write permissions to the folder {}\n", filesystem.getFolderPath());
        filesystem.setUser(owner);
        filesystem.createFile();
        filesystem.createFile();
        filesystem.readFiles();
        System.out.println("Enter the name of file you want to delete");
        filesystem.deleteFile(scanner.nextLine());
        filesystem.writeFiles();

        LOGGER.info("\nOwner has read permissions to the folder {}\n", filesystem.getFolderPath());
        filesystem.setUser(readOnly);
        filesystem.readFiles();


    }

    public static User createUser(Role role) {
        LOGGER.info("Create user");
        Scanner scanner = new Scanner(System.in);
        User user = new User();
        System.out.println("Enter username:");
        user.setUsername(scanner.nextLine());
        System.out.println("Enter password:");
        user.setPassword(scanner.nextLine());
        user.setRole(role);
        return user;
    }
}
