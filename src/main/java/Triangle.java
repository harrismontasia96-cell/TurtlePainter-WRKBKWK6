import java.awt.*;
import java.awt.geom.Point2D;

public class Triangle extends Shape {
    private double side;

    public Triangle(int x, int y, double side) {
        super(x, y);
        this.side = side;
    }

    @Override
    public void paint() {
        // Create the drawing world and turtle
        World world = new World(400, 400);
        Turtle turtle = new Turtle(world, getX(), getY());

        turtle.setColor(Color.MAGENTA);
        turtle.setPenWidth(3);

        // Draw an equilateral triangle
        for (int i = 0; i < 3; i++) {
            turtle.forward(side);
            turtle.turnRight(120);
        }
    }
}



