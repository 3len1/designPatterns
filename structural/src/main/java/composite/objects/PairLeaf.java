package composite.objects;

import composite.enums.Emotion;

/**
 * Created by 3len1 on 3/11/2019.
 */
public class PairLeaf extends Pair {

    public PairLeaf(Emotion emotion) {
        this.emotion = emotion;
    }

    public PairLeaf(Emotion emotion, String description) {
        this.emotion = emotion;
        this.description = description;
    }

    @Override
    public String toString() {
        return print(this);
    }

    @Override
    public boolean equals(Pair pair) {
        if (emotion != pair.emotion) return false;
        return description != null ? description.equals(pair.description) : pair.description == null;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }
}


