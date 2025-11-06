import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApp {
    public static final Scanner keyboard = new Scanner(System.in);
    public static boolean running = true;

    public static void main(String[] args) {
        while (running) {
            display();
            userInput();
        }
    }

    public static void display() {
        System.out.println("===== Options =====");
        System.out.println("\t1) Draw Square");
        System.out.println("\t2) Draw X");
        System.out.println("\t3) Exit Program");
        System.out.print("\nPlease Enter one of the following options: ");
    }

    public static void userInput() {
        String selected = keyboard.nextLine();
        switch (selected) {
            case "1" -> drawSquare();
            case "2" -> drawX();
            case "3" -> drawCircle();
            case "4" -> drawTriangle();
            case "5" -> System.exit(0);
            default -> System.out.println("Invalid Character or number is not an options...\n please try again\n");

        }
    }
    public static void drawSquare() {
        Square square = new Square(-50, -50);
        square.paint();
    }

    public static void drawX() {
        // This starter code to get you familiar with how
        // the TurtleLogo application works

        // The world is your canvas
        World world = new World(200, 200);
        Turtle turtle = new Turtle(world,-100, -100);


        int width = 200;
        int height = 200;
        // calculate the hypotenuse (diagonal)
        // a2 + b2 = c2
        double widthSquared = Math.pow(width, 2);
        double heightSquared = Math.pow(height, 2);
        double hypotenuse = Math.sqrt(widthSquared + heightSquared);


        turtle.setPenWidth(3);
        turtle.setColor(Color.GREEN);

        turtle.turnRight(45);
        turtle.forward(hypotenuse);

        turtle.penUp();
        turtle.goTo(100, 100);
        turtle.turnRight(90);

        turtle.penDown();
        turtle.forward(hypotenuse);
    }
    public static void drawCircle() {
        Circle circle = new Circle(0, 0, 75);
        circle.paint();
    }

    public static void drawTriangle() {
        Triangle triangle = new Triangle(-50, -50, 100);
        triangle.paint();
    }
}
