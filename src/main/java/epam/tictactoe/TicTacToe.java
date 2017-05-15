package epam.tictactoe;

import java.util.Scanner;

/**
 * Created by Mateusz on 2017-05-15.
 */
public class TicTacToe {

    private Board board;

    public void play() {
        System.out.println("Play the game!");
        setConfiguration();
        board.displayBoard();
    }

    private void setConfiguration() {
        System.out.println("Choose size of the board: ");
        Scanner scanner = new Scanner(System.in);
        board = new Board(scanner.nextInt());
    }

}
