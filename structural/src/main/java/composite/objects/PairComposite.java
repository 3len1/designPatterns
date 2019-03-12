package composite.objects;

import composite.enums.Label;

import java.util.List;

/**
 * Created by 3len1 on 3/11/2019.
 */
public class PairComposite extends Pair {

    public PairComposite(Label label, String description) {
        this.label = label;
        this.description = description;
    }

    @Override
    public Pair add(Pair pairComponent) {
        getChildPairComponents().add(pairComponent);
        return pairComponent;
    }

    @Override
    public Pair remove(Pair pairComponent) {
        getChildPairComponents().remove(pairComponent);
        return pairComponent;
    }

    @Override
    public List<Pair> getChildPairComponents() {
        return this.childPairComponents;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(print(this));
        builder.append("Child pairs \n");
        for (Pair child : getChildPairComponents()) {
            builder.append(child.toString());
        }

        return builder.toString();
    }

    @Override
    public boolean equals(Pair other) {
        if (label != other.label) return false;
        return description != null ? description.equals(other.description) : other.description == null;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }
}
