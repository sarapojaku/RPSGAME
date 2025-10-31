public abstract class Player {
    protected String name;
    protected int score = 0;

    public Player(String name) {
        this.name = name;
    }

    public abstract Move chooseMove();

    public void addPoint() {
        score++;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }
}
