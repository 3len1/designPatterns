package proxy.enums;

import lombok.Getter;
import proxy.exceptions.NotValidValueException;

import java.util.Arrays;
import java.util.List;

/**
 * Created by 3len1 on 4/26/2019.
 */
public enum FileType {
    CODE("source code", Arrays.asList(Extension.c, Extension.cpp, Extension.cs, Extension.css, Extension.html,
            Extension.java, Extension.js, Extension.py)),
    DATA("database", Arrays.asList(Extension.csv, Extension.json, Extension.sql, Extension.xml)),
    DOC("document", Arrays.asList(Extension.doc, Extension.docx, Extension.pdf, Extension.txt)),
    EXE("executable", Arrays.asList(Extension.app, Extension.bat, Extension.bin, Extension.exe, Extension.jar)),
    EXCEL("spreadsheet", Arrays.asList(Extension.xls, Extension.xlsx)),
    IMG("image", Arrays.asList(Extension.bmp, Extension.ico, Extension.jpg, Extension.png, Extension.tiff)),
    PPT("powerpoint", Arrays.asList(Extension.ppt, Extension.pptx)),
    VIDEO("video", Arrays.asList(Extension.avi, Extension.flv, Extension.mp3, Extension.mp4)),
    ZIP("archive", Arrays.asList(Extension.iso, Extension.rar, Extension.zip));

    @Getter
    private String description;
    @Getter
    private List<Extension> extensions;

    FileType(String description, List<Extension> extensions) {
        this.description = description;
        this.extensions = extensions;
    }

    public static FileType fromExtennsion(Extension extension) {
        for (FileType type : values()) {
            if (type.getExtensions().contains(extension))
                return type;
        }
        throw new NotValidValueException(FileType.class,
                "The extension " + extension + " is not valid");
    }
}
