import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // create the scanner
        Scanner input = new Scanner(System.in);

        // accept team names
        System.out.println("Enter Team 1's name:" );
        String team1Name = input.next();

        System.out.println("Enter Team 2's name:" );
        String team2Name = input.next();

        // create Team instances
        Team team1 = new Team(team1Name);
        Team team2 = new Team(team2Name);

        //sets then prints the teams names
        team1.setName(team1Name);
        team2.setName(team2Name);
        System.out.println("____________________________________");
        System.out.println("The game is " +  team1.getName()  + " vs " + team2.getName() );

        // accept and set goals for each team
        System.out.println("____________________________________");
        System.out.println("Enter " + team1.getName() + "'s goal score: ");
        int team1Goals = Integer.parseInt(input.next());
        team1.setGoals(team1Goals);

        System.out.println("Enter " + team2.getName() + "'s goal score: ");
        int team2Goals = Integer.parseInt(input.next());
        team2.setGoals(team2Goals);

        System.out.println("____________________________________");
        System.out.println("The score is: " + team1.getName() + " " + team1.getGoals() + " - " + team2.getName() + " " + team2.getGoals());

        // display the winner
        System.out.println("The winner is: " + determineWinner(team1, team2));
        System.out.println("____________________________________");
    }


    public static String determineWinner(Team team1, Team team2) {
        int goals1 = team1.getGoals();
        int goals2 = team2.getGoals();

        if (goals1 > goals2) {
            return team1.getName();
        }
        if (goals2 > goals1) {
            return team2.getName();
        } else {
            return "draw";
        }
    }

}
