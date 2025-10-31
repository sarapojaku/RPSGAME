public class ComputerPlayer extends Player {
    public ComputerPlayer(String name) {
        super(name);
    }

    @Override
    public Move chooseMove() {
        return Move.getRandomMove();
    }
}
