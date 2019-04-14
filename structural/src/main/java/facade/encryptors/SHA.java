package facade.encryptors;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by 3len1 on 4/14/2019.
 */
public class SHA {
    private final String SHA = "SHA";

    public String encrypt(String text) {
        String hash = "";
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA");
            byte[] textBytes = digest.digest(text.getBytes(StandardCharsets.UTF_8));

            StringBuffer buffer = new StringBuffer();
            for (int i = 0; i < textBytes.length; i++) {
                buffer.append(Integer.toString((textBytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            hash = buffer.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return hash;
    }
//    public String encrypt(String text) {
//        return Try.of(() ->  {
//            MessageDigest digest = MessageDigest.getInstance(SHA);
//            byte[] textBytes = digest.digest(text.getBytes(StandardCharsets.UTF_8));
//            StringBuffer buffer = new StringBuffer();
//            for (byte textByte : textBytes) {
//                buffer.append(Integer.toString((textByte & 0xff) + 0x100, 16).substring(1));
//            }
//            return buffer.toString();
//        }).getOrElseThrow(() -> new NotSupportedException(SHA.class, text));
//    }
}
