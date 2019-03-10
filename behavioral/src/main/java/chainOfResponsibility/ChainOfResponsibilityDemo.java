package chainOfResponsibility;

import chainOfResponsibility.enums.RequestType;
import chainOfResponsibility.handlers.*;
import chainOfResponsibility.objects.Request;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

/**
 * Created by 3len1 on 2/4/2019.
 */
public class ChainOfResponsibilityDemo {

    private static final Logger LOGGER = LoggerFactory.getLogger(ChainOfResponsibilityDemo.class);

    public static void main(String[] args) {
        LOGGER.info("Chain Of Responsibility example with request. Have fun to try it!\n");
        Scanner scanner = new Scanner(System.in);
        Handler masterHandler = new MasterHandler();
        Handler devHandler = new DevHandler();
        Handler gameHandler = new GameHandler();
        Handler artHandler = new ArtHandler();
        devHandler.setSuccessor(masterHandler);
        gameHandler.setSuccessor(masterHandler);
        artHandler.setSuccessor(masterHandler);

        LOGGER.info("Create a developing type request");
        System.out.println("Enter title:");
        String tittle = scanner.nextLine();
        System.out.println("Enter description:");
        String description = scanner.nextLine();
        devHandler.handleRequest(new Request(tittle, description, RequestType.DEVELOP));

        LOGGER.info("Create a game type request");
        System.out.println("Enter title:");
        tittle = scanner.nextLine();
        System.out.println("Enter description:");
        description = scanner.nextLine();
        gameHandler.handleRequest(new Request(tittle, description, RequestType.GAME));

        LOGGER.info("Create a artistic type request");
        System.out.println("Enter title:");
        tittle = scanner.nextLine();
        System.out.println("Enter description:");
        description = scanner.nextLine();
        artHandler.handleRequest(new Request(tittle, description, RequestType.ART));

        LOGGER.info("What if a wrong handle try to handle a wrong type ");
        System.out.println("Enter title:");
        tittle = scanner.nextLine();
        System.out.println("Enter description:");
        description = scanner.nextLine();
        devHandler.handleRequest(new Request(tittle, description, RequestType.GAME));

    }
}
