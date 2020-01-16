import javax.swing.*;

public class main {
    public static void main(String[] args){

        //Initializing variables
        String word = JOptionPane.showInputDialog("Please input a word");
        char[] letters = new char[word.length()];
        char[] guessedL = new char[26];

        //Convert the input (word) into the separate characters (letters)
        for(int i = 0; i<word.length(); i++){
            letters[i] = word.charAt(i);
        }

        //Print guessed letters
        for(int i = 0; i<word.length(); i++){

            System.out.println(letters[i]);
        }

    }
}
