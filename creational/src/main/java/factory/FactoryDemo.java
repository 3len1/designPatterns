package factory;

import factory.enums.Color;
import factory.enums.ShapeType;
import factory.factory.ShapeFactory;
import factory.objects.Point;
import factory.objects.Shape;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

/**
 * Created by 3len1 on 1/29/2019.
 */
public class FactoryDemo {

    private static final Logger LOGGER = LoggerFactory.getLogger(FactoryDemo.class);

    public static void main(String[] args) {
        LOGGER.info("Factory example with shapes. Have fun to try it!\n");
        Scanner scanner = new Scanner(System.in);
        LOGGER.info("Lets create a circle!");
        Shape circle = ShapeFactory.getShape(ShapeType.CIRCLE);
        circle.setColor(Color.VIOLET);
        circle.getLines().forEach(line -> {
            System.out.println("Enter the length and the center of the circle: ");
            line.setLength(scanner.nextDouble());
            line.setStart(new Point(scanner.nextInt(), scanner.nextInt()));
            line.setEnd(null);
        });

        LOGGER.info("Lets create a triangle!");
        Shape triangle = ShapeFactory.getShape(ShapeType.TRIANGLE);
        triangle.setColor(Color.SKY_BLUE);
        triangle.getLines().forEach(line -> {
            System.out.println("Enter start and end point of line: ");
            line.setStart(new Point(scanner.nextInt(), scanner.nextInt()));
            line.setEnd(new Point(scanner.nextInt(), scanner.nextInt()));
            line.setLength(getDistanceBetweenTwoPoints(line.getStart(), line.getEnd()));
        });

        LOGGER.info("Lets create a triangle!");
        Shape square = ShapeFactory.getShape(ShapeType.SQUARE);
        square.setColor(Color.BLACK);
        square.getLines().forEach(line -> {
            System.out.println("Enter start and end point of line: ");
            line.setEnd(new Point(scanner.nextInt(), scanner.nextInt()));
            line.setStart(new Point(scanner.nextInt(), scanner.nextInt()));
            line.setLength(getDistanceBetweenTwoPoints(line.getStart(), line.getEnd()));
        });

        LOGGER.info("Shape circle: " + circle.toString());
        LOGGER.info("Shape triangle: " + triangle.toString());
        LOGGER.info("Shape square: " + square.toString());
    }

    private static double getDistanceBetweenTwoPoints(Point start, Point end) {
        double dy = Math.abs(end.getY() - start.getY());
        double dx = Math.abs(end.getX() - start.getX());
        return Math.sqrt((dx * dx) + (dy * dy));
    }
}
