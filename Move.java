public enum Move {
    ROCK,
    PAPER,
    SCISSORS;

    // Decide winner
    public boolean beats(Move other) {
        switch (this) {
            case ROCK:
                return other == SCISSORS;
            case PAPER:
                return other == ROCK;
            case SCISSORS:
                return other == PAPER;
            default:
                return false;
        }
    }

    @Override
    public String toString() {
        switch (this) {
            case ROCK: return "✊ Rock";
            case PAPER: return "✋ Paper";
            case SCISSORS: return "✌️ Scissors";
            default: return super.toString();
        }
    }

    public static Move getRandomMove() {
        Move[] moves = values();
        int randomIndex = (int) (Math.random() * moves.length);
        return moves[randomIndex];
    }
}
