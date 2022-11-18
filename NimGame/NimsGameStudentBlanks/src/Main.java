import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String p1 = "";
        String p2 = "";

        //Asks the user to input thier name for the player
        System.out.println("What is player1's name?: ");
        p1 = sc.next();
        //TO DO: Create Player 1
        Player player1 = new Player(p1);

        //Asks the user to input their name for the player.
        System.out.println("What is player2's name?: ");
        p2 = sc.next();
        //TO DO: Create Player 2
        Player player2 = new Player(p2);

        String again = "Literally any string";
        Player currentPlayer = player1;
        
        //Runs the game
        while (!again.equals("q")){
            //Generates the game
            //TO DO: Create "game"
            Game game = new Game(player1, player2);
            //TO DO: Set the a random player as the current player
            int choiceOf1or2 = (int) Math.random() * 2 + 1;
            if(choiceOf1or2 == 1) game.setFirstPlayer(player1);
            else if(choiceOf1or2 == 2) game.setFirstPlayer(player2);

            //This is the loop in which the game will be played
            while(!game.isComplete()){
               //TO DO
               currentPlayer = game.getNextPlayer();
               game.takePiece();
            }
            System.out.println(currentPlayer.getName()+ " Won!!");
            System.out.println(player1.getName() +" had removed "+ player1.getScore()+" pieces!");
            System.out.println(player2.getName() +" had removed "+ player2.getScore()+" pieces!");
            System.out.println("------------------------------------------");
            System.out.println("Enter q to quit, enter anything else to play again.");
            again = sc.next();
        }
        System.out.println("Thank you for playing!");
    }
}
