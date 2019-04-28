package proxy.enums;

import lombok.Getter;

/**
 * Created by 3len1 on 4/27/2019.
 */
public enum Permissions {
    C("create"),
    E("execute"),
    W("write"),
    R("read");

    @Getter
    private String description;

    Permissions(String description) {
        this.description = description;
    }
}
