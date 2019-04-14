package facade.facade;

import facade.encryptors.MD5;
import facade.encryptors.SHA;
import facade.encryptors.SHA256;

/**
 * Created by 3len1 on 4/14/2019.
 */
public class EncryptorFacade {
    public String encrypt(String type, String text) {
        String hash = "";
        if (type == "MD5") {
            MD5 e = new MD5();
            hash = e.encrypt(text);
        } else if (type == "SHA") {
            SHA e = new SHA();
            hash = e.encrypt(text);
        } else if (type == "SHA256") {
            SHA256 e = new SHA256();
            hash = e.encrypt(text);
        }
        return hash;
    }
}
