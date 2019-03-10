package factory.factory;

import factory.enums.ShapeType;
import factory.objects.Circle;
import factory.objects.Shape;
import factory.objects.Square;
import factory.objects.Triangle;

/**
 * Created by 3len1 on 1/29/2019.
 */
public class ShapeFactory {

    public static Shape getShape(ShapeType type) {
        switch (type) {
            case SQUARE:
                return new Square();
            case TRIANGLE:
                return new Triangle();
            case CIRCLE:
                return new Circle();
            default:
                throw new RuntimeException("Shape " + type + " does not exist");
        }
    }
}
