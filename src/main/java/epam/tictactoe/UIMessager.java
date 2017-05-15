package epam.tictactoe;

import java.io.PrintStream;

/**
 * Created by Mateusz on 2017-05-15.
 */
public class UIMessager {


    private PrintStream out = System.out;

    void message(String message){
        out.println(message);
    }
}
