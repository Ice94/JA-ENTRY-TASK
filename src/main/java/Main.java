import epam.tictactoe.TicTacToe;
import epam.tictactoe.UIMessager;

/**
 * Created by Mateusz on 2017-05-15.
 */
public class Main {
    public static void main (String [] args){

        UIMessager uiMessager = new UIMessager();
        TicTacToe ticTacToe = new TicTacToe(uiMessager);
        ticTacToe.start();
    }
}
