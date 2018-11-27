import java.util.Scanner;

public class Player
{
    public int IntChoice()
    {
        Scanner Inp = new Scanner(System.in);
        int x = Inp.nextInt();

        while (x < 0 || x > 9)
        {
            System.out.println("Numbers accepted: 0-9");
            x = Inp.nextInt();
        }
        return x;
    }
}
