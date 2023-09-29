// logic of the class is stored here

import java.util.Scanner;

public class FizzBuzz {

    private String fizz = "Fizz!";
    private String buzz = "Buzz!";
    private int limit;

    public FizzBuzz(){
        // grabs input from keyboard
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a limit to iterate to: ");
        limit = scanner.nextInt();

        // stuarts code has while loop here
    }

    public void run(){
        for (int i = 1; i <= limit; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                // this logic checks if i is divisible by 3 w/ no remainder and same for 5
                System.out.println(i + ": " + fizz + buzz);
            }
            else if (i % 3 == 0) {
                System.out.println(i + ": " + fizz);
            }
            else if (i % 5 == 0) {
                System.out.println(i + ": " + buzz);
            }
            else {
                System.out.println(i);
            }
        }
    }

    // could I expand with a switch statement? or make this code easier to expand without endless if/else

}
