package epam.tictactoe;

/**
 * Created by Mateusz on 2017-05-15.
 */
public class TicTacToe {
    private char board[][];
    private int size;

    public TicTacToe(int size) {
        this.size = size;
        board = new char[size][size];
    }

    public void displayBoard(){
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                System.out.print("[" + board[i][j] + "]");
            }
            System.out.println();
        }
    }

}
