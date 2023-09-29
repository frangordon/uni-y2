import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // create the scanner
        Scanner input = new Scanner(System.in);

        // ask user for login credentials
        System.out.println("Enter username: ");
        String username = input.nextLine();

        // ask user for password
        System.out.println("Enter password: ");
        String password = input.nextLine();

        // make instances
        Login login = new Login(username, password);
        login.setPassword(password);
        login.setUsername(username);

        // welcome message to print if you get in
        login.getUsername();
        login.getPassword();

        if (login.isCorrect()){
            System.out.println("Welcome to the website, Brian!");
        }

        if (!login.isCorrect()){
            System.out.println("Incorrect username or password or both");
        }
    }

}
