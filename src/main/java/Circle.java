
import java.awt.*;
import java.awt.geom.Point2D;

public class Circle extends Shape {
    private double radius;

    public Circle(Turtle turtle, Point2D location, Color color, double border, double radius) {
        super(turtle, location, color, border);
        this.radius = radius;
    }

    @Override
    public void paint() {
        turtle.setColor(color);
        turtle.setPenWidth(border);
        turtle.penUp();
        turtle.goTo(location);
        turtle.penDown();

        // approximate circle with 360 small steps
        for (int i = 0; i < 360; i++) {
            turtle.forward((2 * Math.PI * radius) / 360);
            turtle.turnRight(1);
        }
    }
}

