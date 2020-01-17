import javax.swing.*;

public class main {
    public static void main(String[] args) {

        //Initializing variables
        String word = (JOptionPane.showInputDialog("Please input a word")).toLowerCase();
        char[] letters = new char[word.length()];
        int[] foundL = new int[word.length()];
        char[] guessedL = new char[10];

        char guess;


        //Convert the input (word) into the separate characters (letters)
        for (int i = 0; i < word.length(); i++) {
            letters[i] = word.charAt(i);
            foundL[i] = 0;
        }

        //Main game loop


        //Print letters
        StringBuilder lastG = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if (foundL[i] == 1) {
                lastG.append(letters[i]).append(" ");
            } else {
                lastG.append("_ ");
            }
        }
        System.out.println("\n" + "\n" + "      " + lastG);

        //Ask for a new guess
        guess = JOptionPane.showInputDialog("Please input your guess").charAt(0);

            System.out.println(guess);
    }
}
