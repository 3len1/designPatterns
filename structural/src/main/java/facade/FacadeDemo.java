package facade;

import facade.enums.EncryptionType;
import facade.facade.EncryptFacade;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

/**
 * Created by 3len1 on 4/11/2019.
 */
public class FacadeDemo {
    private static final Logger LOGGER = LoggerFactory.getLogger(FacadeDemo.class);

    public static void main(String args[]) {
        LOGGER.info("Facade example with encryption. Have fun to try it!\n");
        Scanner scanner = new Scanner(System.in);
        EncryptFacade e = new EncryptFacade();
        System.out.println("Enter the text you want to encrypt");
        String input = scanner.nextLine();

        LOGGER.info("MD5 encryption: {}", e.encrypt(EncryptionType.MD5, input));
        LOGGER.info("SHA encryption: {}", e.encrypt(EncryptionType.SHA, input));
        LOGGER.info("SHA256 encryption: {}", e.encrypt(EncryptionType.SHA256, input));
    }
}
