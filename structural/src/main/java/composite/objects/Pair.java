package composite.objects;

import composite.enums.Emotion;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 3len1 on 3/11/2019.
 */
public abstract class Pair {
    protected List<Pair> childPairComponents = new ArrayList<>();
    @Getter
    Emotion emotion;
    @Getter
    String description;

    public Pair add(Pair pairComponent) {
        throw new UnsupportedOperationException("Feature not implemented at this level");
    }

    public Pair remove(Pair pairComponent) {
        throw new UnsupportedOperationException("Feature not implemented at this level");
    }

    public List<Pair> getChildPairComponents() {
        throw new UnsupportedOperationException("Feature not implemented at this level");
    }

    public abstract String toString();

    public abstract boolean equals(Pair other);

    public abstract void setDescription(String description);

    String print(Pair pairComponent) {
        StringBuilder builder = new StringBuilder(this.getEmotion().getString());
        builder.append(": ");
        builder.append(pairComponent.getDescription());
        builder.append("\n");
        return builder.toString();
    }

}
