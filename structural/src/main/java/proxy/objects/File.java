package proxy.objects;

import lombok.*;
import proxy.enums.Extension;
import proxy.enums.FileType;

/**
 * Created by 3len1 on 4/26/2019.
 */
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class File {

    @Setter
    private String name;
    private Extension extension;
    private FileType fileType;
    @Setter
    private String location;

    public void setExtension(Extension extension) {
        this.extension = extension;
        this.fileType = FileType.fromExtennsion(extension);
    }

    public String getFullName() {
        return location + "\\" + name + "." + extension.name();
    }

    public String getDetails() {
        return "File: " + this.getName() +
                "." + this.getExtension() +
                "\n location " + this.getLocation() +
                "\n type " + this.getFileType();
    }
}
