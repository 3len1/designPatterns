package composite.objects;

import composite.enums.Emotion;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Created by 3len1 on 3/11/2019.
 */
public class PairComposite extends Pair {

    private static final Logger LOGGER = LoggerFactory.getLogger(PairComposite.class);

    public PairComposite(Emotion emotion) {
        this.emotion = emotion;
    }

    public PairComposite(Emotion emotion, String description) {
        this.emotion = emotion;
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
        for (Pair child : getChildPairComponents()) {
            if (!other.getChildPairComponents().contains(child))
                return false;
        }
        if (emotion != other.emotion) return false;
        return description != null ? description.equals(other.description) : other.description == null;
    }

    @Override
    public void setDescription(String description) {
        LOGGER.info("Description can be change only to parent pair");
        this.description = description;
    }
}
