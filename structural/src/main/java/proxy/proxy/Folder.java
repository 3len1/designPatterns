package proxy.proxy;

import proxy.objects.File;

/**
 * Created by 3len1 on 4/27/2019.
 */
public interface Folder {

    void setFolderPath();

    String getFolderPath();

    File createFile();

    void deleteFile(String fileName);

    void readFiles();

    void writeFiles();

    void executeFiles();

}
