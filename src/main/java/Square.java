
import java.awt.*;


public class Square extends Shape {
    private int width;
    private Color color;



    public Square(int x, int y, Color color, int width) {
        super(x, y);
        this.color = color;
        this.width = width;
    }

    @Override
    public void paint() {
        int x  = super.getX();
        int y = super.getY();
        Turtle turtle = new Turtle(new World(), x, y);

        for (int i = 0; i < 4; i++) {
            turtle.forward();
            turtle.turnRight(90);
        }
    }
}


