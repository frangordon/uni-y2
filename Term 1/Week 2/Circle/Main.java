import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // accept the radius from the user
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        Circle circle1 = new Circle(radius);
        System.out.println("Circle 1 - Radius: " + circle1.getRadius() + ", Colour: " + circle1.getColor());

        input.close();
    }
}
