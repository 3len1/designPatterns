package bridge.enums;

/**
 * Created by 3len1 on 2/15/2019.
 */
public enum Label {
    SENDER("sender"),
    RECEIVER("receiver"),
    SIGNATURE("signature"),
    MESSAGE("message"),
    BODY("message body"),
    SUBJECT("subject");

    private String string;

    private Label(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }
}
