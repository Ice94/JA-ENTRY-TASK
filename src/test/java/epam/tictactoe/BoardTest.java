package epam.tictactoe;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by Mateusz on 2017-05-15.
 */
public class BoardTest {

    private int size = 3;
    private Board board;
    private UIMessager uiMessager = new UIMessager();
    @Before
    public void init(){
        board = new Board(size, uiMessager);
    }

    @Test
    public void shouldWinIfThreeInARow(){
        board.setTile(new Tile('O'),0,0);
        board.setTile(new Tile('O'),0,1);
        board.setTile(new Tile('O'),0,2);

        assertTrue(board.isSomeoneWinner());
    }

    @Test
    public void shouldWinIfThreeInAColumn(){
        board.setTile(new Tile('O'),0,0);
        board.setTile(new Tile('O'),1,0);
        board.setTile(new Tile('O'),2,0);

        assertTrue(board.isSomeoneWinner());
    }

    @Test
    public void shouldWinIfThreeInAAcrossDesc(){
        board.setTile(new Tile('O'),0,0);
        board.setTile(new Tile('O'),1,1);
        board.setTile(new Tile('O'),2,2);

        assertTrue(board.isSomeoneWinner());
    }

    @Test
    public void shouldWinIfThreeInAAcrossAsc(){
        board.setTile(new Tile('O'),0,2);
        board.setTile(new Tile('O'),1,1);
        board.setTile(new Tile('O'),2,0);

        assertTrue(board.isSomeoneWinner());
    }

}