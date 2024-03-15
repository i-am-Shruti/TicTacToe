import board.Board;
import player.Player;
import game.Game;
import java.util.*;

public class App {
    
    public static void main(String[] args) throws Exception {
        System.out.println("First project TicTacToe");

       Board b = new Board(3,'-');
       b.printBoardConfig();

              Player p1= new Player();
               p1.setPlayerNameAndSymbol("ambrish", 'X');
               p1.getPlayerNameAndSymbol();

               System.out.println("\n");
               Player p2 = new Player();
               p2.setPlayerNameAndSymbol("Shruti", 'O');
               p2.getPlayerNameAndSymbol();

               Game game = new Game(new Player[]{p1,p2},b);
               game.play();
    /* p1.setPlayersDetails("Ravi",'X',"Karnataka","92763551872","ravi123@gmail.com",21);
       p1.getPlayersDetails();

       p1.changeSymbol('O');
       p1.getPlayersDetails();
      
       Player p2 = new  Player();
       p2.setPlayersDetails("Shruti",'O',"Bihar","9526827009","shruti34@gmail.com",19);
       p2.getPlayersDetails();


       Player p3 = new Player();
       p3.setPlayerNameAndSymbol("ambrish", 'O');
       p3.getPlayerNameAndSymbol();
         b.setDefaultSymbol('-');
         b.printBoardConfig();  */
    }
}
