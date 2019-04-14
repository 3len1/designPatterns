package facade;

import facade.facade.EncryptorFacade;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by 3len1 on 4/11/2019.
 */
public class FacadeDemo {
    private static final Logger LOGGER = LoggerFactory.getLogger(FacadeDemo.class);

    public static void main(String args[]) {
        LOGGER.info("Facade example with encryption. Have fun to try it!\n");
        String myText = "Encrypt this text";
        EncryptorFacade e = new EncryptorFacade();
        System.out.println("MD5 encryption");
        System.out.println(e.encrypt("MD5", myText));
        System.out.println("SHA encryption");
        System.out.println(e.encrypt("SHA", myText));
        System.out.println("SHA256 encryption");
        System.out.println(e.encrypt("SHA256", myText));

    }
}
