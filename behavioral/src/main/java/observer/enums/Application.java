package observer.enums;

/**
 * Created by 3len1 on 2/5/2019.
 */
public enum Application {

    MESSENGER("Messenger app"),
    FACEBOOK("Facebook"),
    SKYPE("Skype"),
    VIBER("Viber"),
    WHATS_APP("What's app"),
    SLACK("Slack"),
    DISCORD("Discord"),
    SMS("phone");

    private String description;

    private Application(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
