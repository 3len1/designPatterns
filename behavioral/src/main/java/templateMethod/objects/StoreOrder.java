package templateMethod.objects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by 3len1 on 2/4/2019.
 */
public class StoreOrder extends OrderTemplate {
    private static final Logger LOGGER = LoggerFactory.getLogger(StoreOrder.class);

    @Override
    public void doCheckout() {
        LOGGER.debug("Ring up items from cart.");
    }

    @Override
    public void doPayment() {
        LOGGER.debug("Process payment with Card present");
    }

    @Override
    public void doDelivery() {
        LOGGER.debug("Bag items at counter");
    }

    @Override
    public void doReceipt() {
        LOGGER.debug("Print receipt");
    }
}