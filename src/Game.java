
public class Game
{
    private Board board;
    enum round {FIRST, SECOND, FINAL};
    
    public Game(Board b, round r)
    {
        this.board = b;
    }
}


