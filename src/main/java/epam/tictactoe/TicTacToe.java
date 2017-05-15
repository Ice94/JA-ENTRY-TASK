package epam.tictactoe;

import java.util.Scanner;

/**
 * Created by Mateusz on 2017-05-15.
 */
public class TicTacToe {

    private final char PLAYER_X = 'X';
    private final char PLAYER_O = 'X';
    private Board board;
    private boolean someoneWins = false;
    private char startSign = 'X';
    Scanner scanner = new Scanner(System.in);

    public void play() {
        System.out.println("Play the game!");
        setConfiguration();
        board.displayBoard();

        while(!someoneWins){
            choosePlaceWherePutChar();
            board.displayBoard();
            board.isSomeoneWinner();
        }

    }
    private void choosePlaceWherePutChar() {
        System.out.println("Your position: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        board.setTile(new Tile(startSign),x,y);
        changePlayers(startSign);
    }

    private void changePlayers(char startSign) {

    }

    private void setConfiguration() {
        System.out.println("Choose size of the board: ");
        board = new Board(scanner.nextInt());
    }

}
