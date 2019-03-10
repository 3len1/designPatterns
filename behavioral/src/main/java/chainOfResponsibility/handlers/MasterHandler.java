package chainOfResponsibility.handlers;

import chainOfResponsibility.objects.Request;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by 3len1 on 2/4/2019.
 */
public class MasterHandler extends Handler {
    private static final Logger LOGGER = LoggerFactory.getLogger(MasterHandler.class);

    @Override
    public void handleRequest(Request request) {
        LOGGER.debug("MasterHandler can handle everything\n");
    }
}
