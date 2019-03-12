package composite.enums;

import composite.exceptions.NotFound;

/**
 * Created by 3len1 on 3/11/2019.
 */
public enum Label {
    JOY("Joy", 1),
    SAD("Sad", 2),
    ANGER("Anger", 3),
    DISGUST("Disgust", 4),
    FEAR("Fear", 5),
    SURPRISE("Surprise", 6);

    private String string;
    private int num;

    private Label(String string, int i) {
        this.string = string;
        this.num = i;
    }

    public String getString() {
        return string;
    }

    public int getNum() {
        return num;
    }

    public Label fromNumber(int num) {
        switch (num) {
            case 1:
                return Label.JOY;
            case 2:
                return Label.SAD;
            case 3:
                return Label.ANGER;
            case 4:
                return Label.DISGUST;
            case 5:
                return Label.FEAR;
            case 6:
                return Label.SURPRISE;
            default:
                throw new NotFound("No Label found for value " + num + ".");
        }

    }
}
