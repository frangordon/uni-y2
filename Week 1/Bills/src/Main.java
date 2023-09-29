// Task: An electricity bill charges the first 100 units used at 26.7p per unit.
// Any units above the first 100 are charged at 15.6p.
// Write a new program to read a number of units and output the cost in pence.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // create the scanner for user input
        Scanner input = new Scanner(System.in);
        System.out.println("Input your electricity reading: ");
        Double reading = Double.valueOf(input.nextLine());

        // make new instance of the electricity class
        Electricity e1 = new Electricity(reading);

        // get the value
        double cost = e1.calculateCost();

        /**
         *  LEARNING: the above method, I initially didn't have
         *  the local variable but this is needed...
         *  I can't just do the calculation on the object.
         *  The object is always reference class
         *  Whereas the cost variable here is a Primitive
         *
         *  Primitive Data Types: These are basic data types provided by Java, such as int, double, char, boolean, etc.
         *  They represent single values and are stored directly in memory.
         *
         * Objects: Objects are instances of classes. They are more complex data structures that can contain multiple values
         * (attributes or fields) and have associated behaviors (methods). Objects are created on the heap memory,
         * and variables that hold objects are actually references to the objects' memory locations.
         *
         */


        // output the cost in pence to the user
        System.out.println("The price is: " + cost + "p");


    }


}