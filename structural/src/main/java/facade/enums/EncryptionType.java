package facade.enums;

/**
 * Created by 3len1 on 4/14/2019.
 */
public enum EncryptionType {
    MD5("MD5"), SHA("SHA"), SHA256("SHA256");

    private String text;

    private EncryptionType(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
