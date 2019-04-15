package facade.encryptors;

import facade.enums.EncryptionType;
import facade.exceptions.NotSupportedException;
import javaslang.control.Try;

import java.security.MessageDigest;

/**
 * Created by 3len1 on 4/14/2019.
 */
public class MD5 {
    public String encrypt(String text) {
        return Try.of(() -> {
            MessageDigest msgDigest = MessageDigest.getInstance(EncryptionType.MD5.getText());
            msgDigest.update(text.getBytes());
            byte textBytes[] = msgDigest.digest();
            StringBuffer buffer = new StringBuffer();
            for (byte textByte : textBytes) {
                buffer.append(Integer.toString((textByte & 0xff) + 0x100, 16).substring(1));
            }
            return buffer.toString();
        }).getOrElseThrow(() -> new NotSupportedException(MD5.class, text));
    }
}
