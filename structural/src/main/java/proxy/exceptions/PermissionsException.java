package proxy.exceptions;

import proxy.enums.Permissions;

/**
 * Created by 3len1 on 4/27/2019.
 */
public class PermissionsException extends RuntimeException {
    public PermissionsException(String message) {
        super(message);
    }

    public PermissionsException(String username, Permissions action) {
        super("Access denied: User " + username + " may not have appropriate permissions to " +
                action.getDescription() + " folder.");
    }

    public PermissionsException(String username, Permissions action, String location) {
        super("Access denied: User " + username + " may not have appropriate permissions to " +
                action.getDescription() + " the folder " + location);
    }
}
