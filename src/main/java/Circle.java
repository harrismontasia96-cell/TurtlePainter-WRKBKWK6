
import java.awt.*;


public class Circle extends Shape {
    private double radius;

    public Circle(int x, int y, double radius) {
        super(x, y);
        this.radius = radius;
    }


    @Override
    public void paint() {
        // Create the drawing world and turtle
        World world = new World(400, 400);
        Turtle turtle = new Turtle(world, getX(), getY());

        turtle.setColor(Color.BLUE);
        turtle.setPenWidth(3);

        // Draw the circle (360 small steps)
        for (int i = 0; i < 360; i++) {
            turtle.forward((2 * Math.PI * radius) / 360);
            turtle.turnRight(1);
        }
    }

}





