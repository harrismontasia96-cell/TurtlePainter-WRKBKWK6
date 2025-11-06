import java.awt.*;
import java.awt.geom.Point2D;

public class Triangle extends Shape {
    private double side;

    public Triangle(int x, int y, double side) {
        super(x, y);
        this.side = side;
    }
}


