package facade.encryptors;

import facade.enums.EncryptionType;
import facade.exceptions.NotSupportedException;
import javaslang.control.Try;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

/**
 * Created by 3len1 on 4/14/2019.
 */
public class SHA256 {
    public String encrypt(String text) {
        return Try.of(() -> {
            MessageDigest digest = MessageDigest.getInstance(EncryptionType.SHA256.getText());
            byte[] textBytes = digest.digest(text.getBytes(StandardCharsets.UTF_8));
            StringBuffer buffer = new StringBuffer();
            for (int i = 0; i < textBytes.length; i++) {
                buffer.append(Integer.toString((textBytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            return buffer.toString();
        }).getOrElseThrow(() -> new NotSupportedException(SHA256.class, text));
    }
}
