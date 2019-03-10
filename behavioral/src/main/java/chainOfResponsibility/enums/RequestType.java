package chainOfResponsibility.enums;

/**
 * Created by 3len1 on 2/4/2019.
 */
public enum RequestType {
    DEVELOP(1),
    GAME(2),
    ART(3);

    private final int option;

    private RequestType(int option) {
        if (option > 0 && option < 4)
            this.option = option;
        else
            throw new RuntimeException("There is no option for number " + option);
    }

    public int getOption() {
        return option;
    }
}
