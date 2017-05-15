package epam.tictactoe;

import java.util.Scanner;

/**
 * Created by Mateusz on 2017-05-15.
 */
public class TicTacToe{

    private final char PLAYER_X = 'X';
    private final char PLAYER_O = 'O';
    private Board board;
    private boolean someoneWins = false;
    private char startSign = 'X';
    Scanner scanner = new Scanner(System.in);
    private final UIMessager uiMessager;

    public TicTacToe(UIMessager uiMessager) {
        this.uiMessager = uiMessager;
    }

    public void start(){
        int nextGame;
        do{
            play();
            uiMessager.message("Do you want Play Again? 1 - yes 0 - no");
            nextGame = scanner.nextInt();

        }while (nextGame == 1);
    }

    public void play() {
        uiMessager.message("Play the game!");
        setConfiguration();
        board.displayBoard();
        message("Who starts? 1 - X 2 - O");
        startSign = choseSign();

        while(!someoneWins){
            message("Turn: " + startSign);

            board.displayBoard();
            choosePlaceWherePutChar();
            someoneWins = board.isSomeoneWinner();

            if(someoneWins){
                message(startSign + " wins!");
            }
            startSign = changePlayers(startSign);
        }

    }

    private void message(String s) {
        uiMessager.message(s);
    }

    private char choseSign() {
        if(scanner.nextInt() == 1){
            return 'X';
        }
        return 'O';
    }


    private void choosePlaceWherePutChar() {
        System.out.println("Your position(y,x): ");
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
        board = new Board(scanner.nextInt(),uiMessager);
    }

}
