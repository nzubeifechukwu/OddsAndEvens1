/**
 * Created by Nzube Ifechukwu: 29 July, 2018
 *
 * This program is a game called "Odds and Evens". It is played between two players, in this case user versus the computer.
 * Each player will choose either "odds" or "evens", since user is playing the computer user will get first pick.
 * Once the players have chosen sides, they each choose a number of fingers to play -- 1 to 10.
 * The winner is determined by whether the sum of both players' fingers is odd or even (depending on what they chose).
 */

import java.util.Scanner; //imports the Scanner class
import java.util.Random; //imports the Random class

public class OddsAndEvens {
    public static void main(String[] args) {
        System.out.println("Let's play a game called \"Odds and Evens\"");
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome. What is your name? ");
        String name = input.nextLine();
        System.out.print("Hi " + name + ", which do you choose (\"O\" for odds, \"E\" for evens)? ");
        String choice = input.next();
        if (choice.equalsIgnoreCase("O")) {
            System.out.println(name + " has picked odds. The computer will be evens");
        } else if (choice.equalsIgnoreCase("E")) {
            System.out.println(name + " has picked evens. The computer will be odds");
        } else {
            System.out.println("\"" + choice + "\" NOT acceptable. Please choose either \"O\" or \"E\"");
        }
        System.out.println("--------------------------------------------------------");
        System.out.print("How many \"fingers\" do you put out (Choose any number from 1 to 10)? ");
        int userFingers = input.nextInt();
        //TO DO: if userFingers is greater than 10 or less than 1, print error message
        Random random = new Random(); //creates an instance of the Random class
        final int MAX = 11;
        final int MIN = 1;
        int computerFingers = random.nextInt(MAX - MIN) + MIN;; //restricts computer's choice of fingers to be within a range of 1 to 10
        System.out.println("The computer plays " + computerFingers + " \"fingers\"");
        System.out.println("--------------------------------------------------------");
        int sumFingers = userFingers + computerFingers;
        System.out.println(userFingers + " + " + computerFingers + " = " + sumFingers);
        // TO DO: ensure error sumFingers is not greater than 10, use if-else.
        if (sumFingers % 2 == 0) {
            System.out.println(sumFingers + " is... EVEN!");
            if (choice.equalsIgnoreCase("E")) {
                System.out.println(name + " WINS!");
            } else if (choice.equalsIgnoreCase("O")){
                System.out.println("The computer WINS!");
            } else {
                System.out.println(choice + " NOT acceptable. Cannot decide winner.");
            }
        } else {
            System.out.println(sumFingers + " is... ODD!");
            if (choice.equalsIgnoreCase("O")) {
                System.out.println(name + " WINS!");
            } else if (choice.equalsIgnoreCase("E")){
                System.out.println("The computer WINS!");
            } else {
                System.out.println(choice + " is UNACCEPTABLE. Cannot decide winner.");
            }
        }
        System.out.println("--------------------------------------------------------");

    }
}