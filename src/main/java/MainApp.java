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
        System.out.println("\t1) Add Shape");
        System.out.println("\t2) Save Shape");
        System.out.println("\t3) Exit Program");
        System.out.print("\nPlease Enter one of the following options: ");
    }

    public static void userInput() {
        String selected = keyboard.nextLine();
        switch (selected) {
            case "1" -> addShapeDisplay();
            case "2" -> System.out.println("wip");
            case "3" -> System.exit(0);
            default -> System.out.println("Invalid Character or number is not an options...\n please try again\n");

        }
    }

    private static void addShapeDisplay() {
        System.out.println("\n=====Adding Shape =====: ");
        System.out.println("\t1) Add Square");
        System.out.println("\t2) Add Triangle");
        System.out.println("\t3) Add Circle");
        System.out.println("please enter one of the numbers above: ");
        addShape();



    }

    private static void addShape() {
        String shape = keyboard.nextLine();
        System.out.println("please enter color");
        String color = keyboard.nextLine();
        System.out.println("please eneter width");
        int width = keyboard.nextInt();
        System.out.println("enter x");
        int x = keyboard.nextInt();
        System.out.println("enter y");
        int y = keyboard.nextInt();
        draw(x,y,width,color,shape);

    }


    public static void draw(int x, int y,int width, String color,String shape) {

        if (shape.equalsIgnoreCase("1")) {
            Square square = new Square(x,y,Color.red,width);
            square.paint();
        }
        else if(shape.equalsIgnoreCase("2")) {
            Triangle triangle = new Triangle(x,y,Color.magenta,width);
            triangle.paint();
        }
        else if (shape.equalsIgnoreCase("3")) {
            Circle circle = new Circle(x,y,Color.cyan,width);
            circle.paint();
        }
        else {
            System.out.println("Invalid Shape");
        }

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
       // Circle circle = new Circle(0, 0, 75);
        // circle.paint();
    }
}
