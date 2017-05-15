package epam.tictactoe;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by Mateusz on 2017-05-15.
 */
public class BoardTest {

    Board board = new Board(3);


    @Test
    public void shouldWinIfThreeInARow(){
        board.setTile(new Tile('O'),0,0);
        board.setTile(new Tile('O'),0,1);
        board.setTile(new Tile('O'),0,2);

        assertTrue(board.isSomeoneWinner());
    }
}