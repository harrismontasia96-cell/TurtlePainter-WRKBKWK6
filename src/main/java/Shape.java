
import java.awt.*;



public abstract class Shape {
    private int x,y;
    private Color color;
    private double border;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


    public void paint() {

    }
}


