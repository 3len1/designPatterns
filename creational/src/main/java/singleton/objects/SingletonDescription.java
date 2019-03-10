package singleton.objects;

import lombok.Getter;
import lombok.ToString;

import java.util.UUID;

/**
 * Created by 3len1 on 1/28/2019.
 */
@Getter
@ToString
public class SingletonDescription {

    private static SingletonDescription INSTANCE = null;
    private static String description;
    private UUID uuid;

    private SingletonDescription(String description) {
        this.uuid = UUID.randomUUID();
        this.description = description;
    }

    public static String getDescription() {
        return description;
    }

    public static void setDescription(String description) {
        SingletonDescription.description = description;
    }

    public static SingletonDescription getInstance(String description) {
        if (INSTANCE == null) {
            synchronized (SingletonDescription.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SingletonDescription(description);
                }
            }
        } else {
            setDescription(description);
        }
        return INSTANCE;
    }
}
