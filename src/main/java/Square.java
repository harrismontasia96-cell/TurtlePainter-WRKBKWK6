
import java.awt.*;
import java.awt.geom.Point2D;

public class Square extends Shape{
    private double size;

    public Square(Turtle turtle, Point2D location, Color color, double border, double size) {
        super(turtle, location, color, border);
        this.size = size;
    }

    @Override
    public void paint() {
        turtle.setColor(color);
        turtle.setPenWidth(border);
        turtle.penUp();
        turtle.goTo(location);
        turtle.penDown();

        for (int i = 0; i < 4; i++) {
            turtle.forward(size);
            turtle.turnRight(90);
        }
    }
}

