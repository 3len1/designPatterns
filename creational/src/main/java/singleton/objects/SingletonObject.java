package singleton.objects;

import lombok.Getter;
import lombok.ToString;

import java.util.UUID;

/**
 * Created by 3len1 on 1/28/2019.
 */
@Getter
@ToString
public class SingletonObject {

    private static SingletonObject INSTANCE = null;
    private UUID uuid;

    private SingletonObject() {
        this.uuid = UUID.randomUUID();
    }

    public static SingletonObject getInstance() {
        if (INSTANCE == null) {
            synchronized (SingletonObject.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SingletonObject();
                }
            }
        }
        return INSTANCE;
    }
}
