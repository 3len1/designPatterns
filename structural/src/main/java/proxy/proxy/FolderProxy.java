package proxy.proxy;


import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import proxy.enums.Role;
import proxy.exceptions.NullableException;
import proxy.objects.File;
import proxy.objects.User;

/**
 * Created by 3len1 on 4/27/2019.
 */
public class FolderProxy implements Folder {
    private static final Logger LOGGER = LoggerFactory.getLogger(FolderProxy.class);
    Folder folder;

    @Getter
    @Setter
    User user;

    public void createFolder() {
        validateNullables(true, false);
        if (Role.ADMIN.equals(user.getRole()) || Role.OWNER.equals(user.getRole())) {
            folder = new FolderImpl();
            folder.setFolderPath();
        } else {
            LOGGER.warn("User {} has no authority to create folders.", user.getUsername());
            //throw new PermissionsException(user.getUsername(), Permissions.C);
        }
    }

    @Override
    public void setFolderPath() {
        validateNullables(true, true);
        if (Role.ADMIN.equals(user.getRole()) || Role.OWNER.equals(user.getRole()))
            folder.setFolderPath();
        else {
            LOGGER.warn("User {} has no authority to change a folder location.", user.getUsername());
            //throw new PermissionsException(user.getUsername(), Permissions.W, folder.getFolderPath());
        }
    }

    @Override
    public String getFolderPath() {
        validateNullables(true, true);
        return folder.getFolderPath();
    }

    @Override
    public File createFile() {
        validateNullables(true, true);
        if (Role.ADMIN.equals(user.getRole()) || Role.OWNER.equals(user.getRole()))
            return folder.createFile();
        else {
            LOGGER.warn("User {} has no authority to create files.", user.getUsername());
            //TODO delete this line if you want to throw exception
            return null;
            //throw new PermissionsException(user.getUsername(), Permissions.W, folder.getFolderPath());
        }
    }

    @Override
    public void deleteFile(String fileName) {
        validateNullables(true, true);
        if (Role.ADMIN.equals(user.getRole()) || Role.OWNER.equals(user.getRole()))
            folder.deleteFile(fileName);
        else {
            LOGGER.warn("User {} has no authority to delete files.", user.getUsername());
            //throw new PermissionsException(user.getUsername(), Permissions.W, folder.getFolderPath());
        }
    }

    @Override
    public void readFiles() {
        validateNullables(true, true);
        folder.readFiles();
    }

    @Override
    public void writeFiles() {
        validateNullables(true, true);
        if (Role.ADMIN.equals(user.getRole()) || Role.OWNER.equals(user.getRole()))
            folder.writeFiles();
        else {
            LOGGER.warn("User {} has no authority to write files", user.getUsername());
            //throw new PermissionsException(user.getUsername(), Permissions.W, folder.getFolderPath());
        }
    }

    @Override
    public void executeFiles() {
        validateNullables(true, true);
        if (Role.ADMIN.equals(user.getRole()) || Role.OPERATOR.equals(user.getRole()))
            folder.executeFiles();
        else {
            LOGGER.warn("User {} has no authority to execute files", user.getUsername());
            //throw new PermissionsException(user.getUsername(), Permissions.E, folder.getFolderPath());
        }
    }

    private void validateNullables(boolean userFlag, boolean folderFlag) {
        if (userFlag && user == null)
            throw new NullableException(User.class, "No user found in FolderProxy");
        if (folderFlag && folder == null)
            throw new NullableException(Folder.class, "No folder found in FolderProxy");
    }
}
