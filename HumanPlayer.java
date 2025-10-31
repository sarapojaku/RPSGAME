import java.util.Scanner;

public class HumanPlayer extends Player {
    private Scanner scanner;

    public HumanPlayer(String name, Scanner scanner) {
        super(name);
        this.scanner = scanner;
    }

    @Override
    public Move chooseMove() {
        System.out.println("Choose your move (rock, paper, scissors): ");
        String input = scanner.nextLine().trim().toLowerCase();

        switch (input) {
            case "rock": return Move.ROCK;
            case "paper": return Move.PAPER;
            case "scissors": return Move.SCISSORS;
            default:
                System.out.println("Invalid choice, try again!");
                return chooseMove();
        }
    }
}
