package chainOfResponsibility.handlers;

import chainOfResponsibility.enums.RequestType;
import chainOfResponsibility.objects.Request;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by 3len1 on 2/4/2019.
 */
public class ArtHandler extends Handler {
    private static final Logger LOGGER = LoggerFactory.getLogger(ArtHandler.class);

    @Override
    public void handleRequest(Request request) {
        if (request.getType() == RequestType.ART)
            LOGGER.info("Request [" + request.getTittle() + "] successfully handled by ArtHandler\n");
        else {
            LOGGER.warn("ArtHandler can't handle request [" + request.getTittle() +
                    "] with type [" + request.getType() + "]\n");
            successor.handleRequest(request);
        }
    }
}
