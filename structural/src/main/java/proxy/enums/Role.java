package proxy.enums;

import lombok.Getter;
import proxy.exceptions.NotValidValueException;

import java.util.Arrays;

/**
 * Created by 3len1 on 4/26/2019.
 */
public enum Role {
    ADMIN("rwx"),
    OPERATOR("r-x"),
    OWNER("rw-"),
    READ_ONLY("r--");

    @Getter
    private String permission;

    Role(String permission) {
        this.permission = permission;
    }

    public static Role fromPermisions(String permissions) {
        return Arrays.asList(Role.values()).stream()
                .filter(r -> r.getPermission().equals(permissions)).findFirst()
                .orElseThrow(() -> new NotValidValueException(Role.class, "" +
                        "The permision " + permissions + " is not valid"));
    }

    @Override
    public String toString() {
        return super.toString() +
                "(" + permission + ")";
    }

}