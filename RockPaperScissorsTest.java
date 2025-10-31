import java.util.Scanner;

public class RockPaperScissorsTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Rock, Paper, Scissors! Best of 3!");
        System.out.print("Enter your name: ");
        String playerName = scanner.nextLine();

        Player human = new HumanPlayer(playerName, scanner);
        Player computer = new ComputerPlayer("Computer");

        Game game = new Game(human, computer);
        game.playBestOf3();

        scanner.close();
    }
}

