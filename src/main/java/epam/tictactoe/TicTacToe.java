package epam.tictactoe;

import java.util.Scanner;

/**
 * Created by Mateusz on 2017-05-15.
 */
public class TicTacToe {

    private final char PLAYER_X = 'X';
    private final char PLAYER_O = 'O';
    private Board board;
    private boolean someoneWins = false;
    private char startSign = 'X';
    Scanner scanner = new Scanner(System.in);

    public void play() {
        System.out.println("Play the game!");
        setConfiguration();
        board.displayBoard();

        while(!someoneWins){
            askAboutWhoStart();
            startSign = choseSign();
            choosePlaceWherePutChar();
            board.displayBoard();
            someoneWins = board.isSomeoneWinner();

            if(someoneWins){
                notifyAboutWin();
            }
            startSign = changePlayers(startSign);
        }

    }

    private void askAboutWhoStart() {
        System.out.println("Who starts? 1 - X 2 - O");
    }

    private char choseSign() {
        if(scanner.nextInt() == 1){
            return 'X';
        }
        return 'O';
    }

    private void notifyAboutWin() {
        System.out.println(startSign + " wins!");
    }

    private void choosePlaceWherePutChar() {
        System.out.println("Your position: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        board.setTile(new Tile(startSign),x,y);

    }

    private char changePlayers(char startSign) {
        if(startSign == PLAYER_X){
            return PLAYER_O;
        }
        return PLAYER_X;
    }

    private void setConfiguration() {
        System.out.println("Choose size of the board: ");
        board = new Board(scanner.nextInt());
    }

}
