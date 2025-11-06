
import java.awt.*;



public abstract class Shape {
    private int x,y;
    private Color color;
    private double border;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public void paint() {
        Turtle turtle = new Turtle(new World(),this.x,this.y);


        for (int i = 0; i < 4; i++) {
            turtle.forward();
            turtle.turnRight(90);
        }

    }
}


