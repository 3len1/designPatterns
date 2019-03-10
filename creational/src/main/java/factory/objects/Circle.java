package factory.objects;

import java.util.ArrayList;

/**
 * Created by 3len1 on 1/29/2019.
 */
public class Circle extends Shape {
    private static final int NUM_LINES = 1;

    @Override
    public void createShape() {
        super.setLines(new ArrayList<>());
        for (int i = 0; i < NUM_LINES; i++)
            super.getLines().add(new Line());
    }

    @Override
    public boolean isPolygon() {
        return false;
    }
}
