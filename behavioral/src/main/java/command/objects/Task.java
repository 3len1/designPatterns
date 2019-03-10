package command.objects;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by 3len1 on 1/31/2019.
 */
@Getter
@Setter
@ToString
public class Task {
    private String tittle;
    private String description;
    private Boolean done;

    public Task(String tittle, String description) {
        this.tittle = tittle;
        this.description = description;
        this.done = Boolean.FALSE;
    }

    public Task(String tittle) {
        this.tittle = tittle;
        this.done = Boolean.FALSE;
    }

    public void toggle() {
        if (getDone())
            setDone(Boolean.FALSE);
        else
            setDone(Boolean.TRUE);
    }

}
