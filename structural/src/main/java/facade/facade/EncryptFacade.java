package facade.facade;

import facade.encryptors.MD5;
import facade.encryptors.SHA;
import facade.encryptors.SHA256;
import facade.enums.EncryptionType;

/**
 * Created by 3len1 on 4/14/2019.
 */
public class EncryptFacade {
    public String encrypt(EncryptionType type, String text) {
        switch (type) {
            case MD5:
                MD5 md5 = new MD5();
                return md5.encrypt(text);
            case SHA:
                SHA sha = new SHA();
                return sha.encrypt(text);
            case SHA256:
                SHA256 sha256 = new SHA256();
                return sha256.encrypt(text);
            default:
                throw new RuntimeException();
        }
    }
}
