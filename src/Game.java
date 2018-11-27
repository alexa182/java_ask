import java.util.Random;

public class Game
{
    public int Randomchoice()
    {
        Random Rand = new Random();
        return Rand.nextInt(9);
    }
}
