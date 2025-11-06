import java.awt.*;
import java.awt.geom.Point2D;

public class Triangle extends Shape {
    private double side;

    public Triangle(Turtle turtle, Point2D location, Color color, double border, double side) {
        super(turtle, location, color, border);
        this.side = side;
    }

    @Override
    public void paint() {
        turtle.setColor(color);
        turtle.setPenWidth(border);
        turtle.penUp();
        turtle.goTo(location);
        turtle.penDown();

        for (int i = 0; i < 3; i++) {
            turtle.forward(side);
            turtle.turnRight(120);
        }
    }
}

