public class Launcher
{
    public static void main(String[] args)
    {
        Game env = new Game();
        Player players = new Player();

        int x = env.Randomchoice();
        int[] player_choice = new int[3];
        boolean restart = true;

        while(restart)
        {
            for(int i=0;i<3;i++)
            {
                System.out.println("\nPlayer:"+(i+1));
                player_choice[i]=players.IntChoice();
            }
            System.out.println("\nWINNING NUMBER IS "+x+"\n");

            for(int i=0;i<3;i++)
            {
                if (x == player_choice[i])
                {
                    System.out.println("PLAYER "+(i+1)+" IS THE WINNER");
                    restart = false;
                }
                else
                {
                    System.out.println("PLAYER "+(i+1)+" LOSSES!");
                }
            }
            x = env.Randomchoice();
        }
    }
}
