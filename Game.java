public class Game {
    private Player human;
    private Player computer;

    public Game(Player human, Player computer) {
        this.human = human;
        this.computer = computer;
    }

    public void playBestOf3() {
        while (human.getScore() < 2 && computer.getScore() < 2) {
            playRound();
        }

        if (human.getScore() == 2) {
            System.out.println(human.getName() + " wins the best of 3!");
        } else {
            System.out.println(computer.getName() + " wins the best of 3!");
        }
    }

    private void playRound() {
        Move humanMove = human.chooseMove();
        Move computerMove = computer.chooseMove();

        System.out.println(human.getName() + " chose " + humanMove);
        System.out.println(computer.getName() + " chose " + computerMove);

        if (humanMove == computerMove) {
            System.out.println("It's a tie!\n");
        } else if (humanMove.beats(computerMove)) {
            System.out.println(human.getName() + " wins this round!\n");
            human.addPoint();
        } else {
            System.out.println(computer.getName() + " wins this round!\n");
            computer.addPoint();
        }

        System.out.println("Score: " + human.getName() + " " + human.getScore() +
                           " - " + computer.getName() + " " + computer.getScore() + "\n");
    }
}
