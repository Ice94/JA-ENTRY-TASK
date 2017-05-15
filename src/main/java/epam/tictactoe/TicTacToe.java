package epam.tictactoe;

/**
 * Created by Mateusz on 2017-05-15.
 */
public class TicTacToe {
    char board[][];
    int size;

    public TicTacToe(int size) {
        this.size = size;
        board = new char[size][size];
    }


}
