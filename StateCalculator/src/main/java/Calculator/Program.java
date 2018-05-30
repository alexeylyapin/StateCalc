package Calculator;

import Calculator.Context;

import java.io.IOException;

/**
 * Created by Алексей on 24.05.2018.
 */
public class Program {
    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to integer Calculator!");
        Context calc = new Context();
        while(true) {

            char key = (char) System.in.read();
            if(key>=' ' ) {

                calc.press(key);
            }
        }

    }
}
