package state.states;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import state.exceptions.InaccessibleExceptions;

/**
 * Created by 3len1 on 2/6/2019.
 */
public abstract class State {
    private static final Logger LOGGER = LoggerFactory.getLogger(State.class);

    public void handleRequest() {
        LOGGER.warn("This place is inaccessible.");
        throw new InaccessibleExceptions("401", "Access denied.");
    }
}
