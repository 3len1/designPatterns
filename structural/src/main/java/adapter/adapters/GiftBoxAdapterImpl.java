package adapter.adapters;

import adapter.enums.Level;
import adapter.objects.Craft;

/**
 * Created by 3len1 on 2/12/2019.
 */
public class GiftBoxAdapterImpl implements GiftBoxAdapter {

    private GiftBox box = new GiftBox();

    @Override
    public Craft getHardCraft() {
        return box.getCraft();
    }

    @Override
    public Craft getMediumCraft() {
        return convertCraftLevel(box.getCraft(), Level.MEDIUM);
    }

    @Override
    public Craft getEasyCraft() {
        return convertCraftLevel(box.getCraft(), Level.EASY);
    }

    private Craft convertCraftLevel(Craft craft, Level level) {
        craft.setLevel(level);
        return craft;
    }
}
