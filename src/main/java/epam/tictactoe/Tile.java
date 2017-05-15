package epam.tictactoe;

/**
 * Created by Mateusz on 2017-05-15.
 */
class Tile {
    private char value;

    public Tile(char value){
        this.value = value;
    }

    public char getValue() {
        return value;
    }

    public void setValue(char value) {
        this.value = value;
    }
}
