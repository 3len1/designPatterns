package templateMethod.objects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by 3len1 on 2/4/2019.
 */
public class WebOrder extends OrderTemplate {

    private static final Logger LOGGER = LoggerFactory.getLogger(WebOrder.class);

    @Override
    public void doCheckout() {
        LOGGER.debug("Get items from cart,");
        LOGGER.debug("Set gift preferences,");
        LOGGER.debug("Set delivery address,");
        LOGGER.debug("Set billing address.");
    }

    @Override
    public void doPayment() {
        LOGGER.debug("Process payment without Card present");
    }

    @Override
    public void doDelivery() {
        LOGGER.debug("Ship the item to address");
    }

    @Override
    public void doReceipt() {
        LOGGER.debug("Email receipt");
    }

}
