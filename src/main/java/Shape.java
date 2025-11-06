
import java.awt.*;
import java.awt.geom.Point2D;


public abstract Shape {
    protected Turtle turtle;
    protected Point2D location;
    protected Color color;
    protected double border;

    public Shape(Turtle turtle, Point2D location, Color color, double border) {
        this.turtle = turtle;
        this.location = location;
        this.color = color;
        this.border = border;
    }

    // abstract method that child classes must define
    public abstract void paint();
}


