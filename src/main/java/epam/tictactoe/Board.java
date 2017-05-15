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
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                tiles[i][j] = new Tile('F');
            }
        }
    }

    void displayBoard(){
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                System.out.print("[" + tiles[i][j].getValue()+ "]");
            }
            System.out.println();
        }
    }


    public void setSize(int size) {
        this.size = size;
    }

    public void setTile(Tile tile, int x, int y) {
        tiles[x][y] = tile;
    }

    public boolean isSomeoneWinner() {

        for(int i = 0; i < size-2; i++){
            for(int j = 0; j < size-2; j++){
                if(checkVertical(i,j) || checkHorizontal(i,j) || checkAcrossAsc(i,j)){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean checkAcrossDesc(int i, int j) {
        if(tiles[i][j].getValue() == tiles[i-1][j-1].getValue() &&
                tiles[i-1][j-1].getValue() == tiles[i-1][j-2].getValue()){
            return true;
        }
        return false;
    }

    private boolean checkAcrossAsc(int i, int j) {
        if(tiles[i][j].getValue() == tiles[i+1][j+1].getValue() &&
                tiles[i+1][j+1].getValue() == tiles[i+1][j+2].getValue()){
            return true;
        }
        return false;
    }

    private boolean checkHorizontal(int i, int j) {
        if(tiles[i][j].getValue() == tiles[i][j+1].getValue() &&
                tiles[i][j+1].getValue() == tiles[i][j+2].getValue()){
            return true;
        }
        return false;
    }

    private boolean checkVertical(int i, int j) {
        if(tiles[i][j].getValue() == tiles[i+1][j].getValue() &&
                tiles[i+1][j].getValue() == tiles[i+2][j].getValue()){
            return true;
        }
        return false;
    }
}
