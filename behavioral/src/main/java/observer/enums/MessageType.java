package observer.enums;

/**
 * Created by 3len1 on 2/5/2019.
 */
public enum MessageType {
    TEXT("Message has only text"),
    EMOJI("Message has text and emoticons"),
    STICKER("Message has only sticker"),
    PHOTO("Message has only one photo"),
    MULTIMEDIA("Message can have any multimedia");

    private String description;

    private MessageType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

