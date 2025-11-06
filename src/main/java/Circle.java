
import java.awt.*;


public class Circle extends Shape {
    private int radius;
    private Color color;



    public Circle(int x, int y, Color color, int radius) {
        super(x, y);
        this.color = color;
        this.radius = radius;
    }

    @Override
    public void paint() {
        int x  = super.getX();
        int y = super.getY();
        Turtle turtle = new Turtle(new World(), x, y);
        for (int i = 0; i < 36; i++) {
            turtle.forward((2 * Math.PI * radius) / 36);
            turtle.turnRight(10);
        }
    }

}





