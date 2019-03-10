package factory.objects;

import factory.enums.Color;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * Created by 3len1 on 1/29/2019.
 */
@Getter
@Setter
@ToString
public abstract class Shape {
    private Color color;
    private List<Line> lines;

    public Shape() {
        this.createShape();
    }

    public abstract boolean isPolygon();

    public abstract void createShape();
}
