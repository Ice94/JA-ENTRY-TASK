package epam.tictactoe;

/**
 * Created by Mateusz on 2017-05-15.
 */
class Board {
    private Tile tiles [][];
    private int size;

    Board(int size){
        this.size = size;
        tiles = new Tile[size][size];
    }

    void displayBoard(){
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                System.out.print("[" + tiles[i][j] + "]");
            }
            System.out.println();
        }
    }


    public void setSize(int size) {
        this.size = size;
    }
}
