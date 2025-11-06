import java.awt.*;
import java.awt.geom.Point2D;

public class Triangle extends Shape {
    private int width;
    private Color color;



    public Triangle(int x, int y, Color color, int width) {
        super(x, y);
        this.color = color;
        this.width = width;
    }

    @Override
    public void paint() {
        int x  = super.getX();
        int y = super.getY();
        Turtle turtle = new Turtle(new World(), x, y);
        for (int i = 0; i < 3; i++) {
            turtle.forward();
            turtle.turnRight(120);
        }
    }
}



