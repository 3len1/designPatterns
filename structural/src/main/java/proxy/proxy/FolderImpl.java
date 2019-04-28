package proxy.proxy;

import javaslang.control.Try;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import proxy.enums.Extension;
import proxy.exceptions.NotValidValueException;
import proxy.objects.File;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by 3len1 on 4/27/2019.
 */
public class FolderImpl implements Folder {
    private static final Logger LOGGER = LoggerFactory.getLogger(FolderImpl.class);
    Scanner scanner = new Scanner(System.in);
    List<File> files;
    String path;


    @Override
    public void setFolderPath() {
        System.out.println("Enter path:");
        path = scanner.nextLine();
        files = new ArrayList<>();
        LOGGER.info("Folder path {} successfully set", path);
    }

    @Override
    public String getFolderPath() {
        return path;
    }

    @Override
    public File createFile() {
        LOGGER.info("Create file");
        File file = new File();
        System.out.println("Enter the file name:");
        file.setName(scanner.nextLine());
        file.setLocation(path);
        System.out.println("Enter the file extension:");
        file.setExtension(Try.of(() -> Extension.valueOf(scanner.nextLine()))
                .getOrElseThrow(() -> new NotValidValueException(Extension.class,
                        "The extension is not valid")));
        files.add(file);
        LOGGER.info("File {} successfully created", file.getFullName());
        return file;

    }

    @Override
    public void deleteFile(String fileName) {
        LOGGER.info("Delete folder");
        files.stream().filter(f -> f.getFullName().equals(fileName)).findFirst().
                ifPresent(file -> {
                    files.remove(file);
                    LOGGER.info("File {} successfully deleted", fileName);
                });
    }

    @Override
    public void readFiles() {
        LOGGER.info("Read files from folder {}.", path);
        System.out.println(this.lookUp());

    }

    @Override
    public void writeFiles() {
        LOGGER.info("Write files from folder {}.", path);
        System.out.println(this.lookUp());

    }

    @Override
    public void executeFiles() {
        LOGGER.info("Execute files from folder {}.", path);
        System.out.println(this.parse());

    }

    private String lookUp() {
        StringBuilder builder = new StringBuilder();
        builder.append("Folder: ").append(path)
                .append("\n________________________________________\n");
        files.forEach(f -> builder.append(f.getFullName()).append("\n"));
        return builder.toString();
    }

    private String parse() {
        StringBuilder builder = new StringBuilder();
        builder.append("Folder: ").append(path)
                .append("\n________________________________________\n\n");
        files.forEach(f -> builder.append(f.getDetails()).append("\n"));
        return builder.toString();
    }
}
