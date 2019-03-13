package composite.enums;

import composite.exceptions.NotFound;

import java.util.Arrays;

/**
 * Created by 3len1 on 3/11/2019.
 */
public enum Emotion {
    JOY("Joy", 1),
    SAD("Sad", 2),
    ANGER("Anger", 3),
    DISGUST("Disgust", 4),
    FEAR("Fear", 5),
    SURPRISE("Surprise", 6),
    HAPPINESS("Happiness", 7),
    DEPRESSION("Depression", 8),
    LOVE("Love", 9),
    ENVY("Envy", 10),
    COURAGE("Courage", 11),
    DESPAIR("Despair", 12),
    KINDNESS("Kindness", 13),
    CRUELTY("Cruelty", 14),
    CALMNESS("Calmness", 15),
    WILL("Will", 16),
    CARE("Care", 17),
    TRUST("Trust", 18),
    ANXIETY("Anxiety", 19),
    INDIGNATION("Indignation", 20);

    private String string;
    private int num;

    private Emotion(String string, int i) {
        this.string = string;
        this.num = i;
    }

    public static Emotion fromNumber(int num) {
        if (num > 0 && num < Emotion.values().length) {
            return Arrays.stream(Emotion.values())
                    .filter(emotion -> emotion.getNum() == num).findFirst()
                    .orElseThrow(() -> new NotFound("No Emotion found for value " + num + "."));
        }
        throw new NotFound("No Emotion found for value " + num + ".");
    }

    public static String printValus() {
        StringBuilder builder = new StringBuilder();
        builder.append("Emotions\n_________________________________________\n");
        Arrays.stream(Emotion.values()).forEach(emotion ->
                builder.append(emotion.getString() + ": " + emotion.getNum() + "\n")
        );
        return builder.toString();
    }

    public String getString() {
        return string;
    }

    public int getNum() {
        return num;
    }
}
