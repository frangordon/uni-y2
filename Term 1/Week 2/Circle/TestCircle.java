import org.junit.jupiter.api.Test;

public class TestCircle {

    public static void main(String[] args) {

        // Declare an instance of circle called c1 using default constructor
        Circle c1 = new Circle();

        // invoke public methods on c1
        System.out.println("The circle has a radius of " + c1.getRadius() + "and area of " + c1.getArea());

        // make another instance of circle called c2, use second constructor
        Circle c2 = new Circle(2.0);

        // invoke public methods on instance c2
        System.out.println("The circle has a radius of " + c2.getRadius() + "and area of " + c2.getArea());

    }

    //@Test these are not junit tests for this task


}
