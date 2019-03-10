package adapter;

import adapter.adapters.GiftBoxAdapter;
import adapter.adapters.GiftBoxAdapterImpl;
import adapter.objects.Craft;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by 3len1 on 2/12/2019.
 */
public class AdapterDemo {
    private static final Logger LOGGER = LoggerFactory.getLogger(AdapterDemo.class);

    public static void main(String args[]) {
        LOGGER.info("Adapter example with DIY object. Have fun to try it!\n");

        GiftBoxAdapter giftBoxAdapter = new GiftBoxAdapterImpl();

        Craft hardGiftBox = giftBoxAdapter.getHardCraft();
        LOGGER.info("Gift box craft - Hard level \n" + hardGiftBox.toString());

        Craft mediumGiftBox = giftBoxAdapter.getMediumCraft();
        LOGGER.info("Gift box craft - Medium level \n" + mediumGiftBox.toString());

        Craft easyGiftBox = giftBoxAdapter.getEasyCraft();
        LOGGER.info("Gift box craft - Easy level \n" + easyGiftBox.toString());


    }
}
