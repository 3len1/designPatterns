package facade.encryptors;

import facade.enums.EncryptionType;
import facade.exceptions.NotSupportedException;
import javaslang.control.Try;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

/**
 * Created by 3len1 on 4/14/2019.
 */
public class SHA {
    public String encrypt(String text) {
        return Try.of(() -> {
            MessageDigest digest = MessageDigest.getInstance(EncryptionType.SHA.getText());
            byte[] textBytes = digest.digest(text.getBytes(StandardCharsets.UTF_8));
            StringBuffer buffer = new StringBuffer();
            for (byte textByte : textBytes) {
                buffer.append(Integer.toString((textByte & 0xff) + 0x100, 16).substring(1));
            }
            return buffer.toString();
        }).getOrElseThrow(() -> new NotSupportedException(SHA.class, text));
    }
}
