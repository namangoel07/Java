package lecturesix.lecturesixpointfour;
import java.util.Scanner;

class Guess {
    int guessnumber;
    int guessingnumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Guesser! kindly guess the number");
        guessnumber = scan.nextInt();
        return guessnumber;
    }
}

class Player {
    int guessnumber;
    int guessingnumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Player! kindly guess the number");
        guessnumber = scan.nextInt();
        return guessnumber;
    }
}

class Umpire {
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void collectNumFromGuesser() {
        Guess g = new Guess();
        numFromGuesser = g.guessingnumber();
    }

    void collectnumFromplayers() {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();

        numFromPlayer1 = p1.guessingnumber();
        numFromPlayer2 = p2.guessingnumber();
        numFromPlayer3 = p3.guessingnumber();
    }

    void compare() {
        if (numFromGuesser == numFromPlayer1) {
            if (numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3) {
                System.out.println("Player 1,2,3 guessed correctly");
            } else if (numFromGuesser == numFromPlayer2) {
                System.out.println("Player 1,2 guessed correctly");
            } else if (numFromGuesser == numFromPlayer3) {
                System.out.println("Player 1,3 guessed correctly");
            } else {
                System.out.println("Player 1 won the game");
            }
        } else if (numFromGuesser == numFromPlayer2) {
            if (numFromGuesser == numFromPlayer3) {
                System.out.println("Player 2 and 3 guessed correctly");
            } else {
                System.out.println("Player 2 won the game");
            }
        } else if (numFromGuesser == numFromPlayer3) {
            System.out.println("Player 3 won the game");
        } else {
            System.out.println("Game lost!");
        }
    }
}

public class LaunchGame {
    public static void main(String[] args) {
        Umpire umpire = new Umpire();
        umpire.collectNumFromGuesser();
        umpire.collectnumFromplayers();
        umpire.compare();
    }
}