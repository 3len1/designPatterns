package composite.objects;

import composite.enums.Label;

/**
 * Created by 3len1 on 3/11/2019.
 */
public class PairLeaf extends Pair {

    public PairLeaf(Label label, String description) {
        this.label = label;
        this.description = description;
    }


    @Override
    public String toString() {
        return print(this);
    }

    @Override
    public boolean equals(Pair pair) {
        if (label != pair.label) return false;
        return description != null ? description.equals(pair.description) : pair.description == null;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }
}


