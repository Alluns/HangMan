import javax.swing.*;

public class main {
    public static void main(String[] args) {

        //Initializing variables
        String word = (JOptionPane.showInputDialog("Please input a word")).toLowerCase();
        char[] letters = new char[word.length()];
        char[] guessedL = new char[4];

        guessedL[2] = 'h';
        guessedL[1] = 'l';

        boolean foundL = false;
        StringBuilder foundWord = new StringBuilder();

        //Convert the input (word) into the separate characters (letters[])
        for (int i = 0; i < word.length(); i++) {
            letters[i] = word.charAt(i);
        }

        //Print guessed letters
        for (int i = 0; i < word.length(); i++) {
            for (int k = 0; k < 3; k++){
                if (guessedL[k] == letters[i]){
                    foundL = true;
                    break;
                }
            }
            if(foundL){
                foundWord.append(letters[i]).append(" ");
            }
            else{
                foundWord.append("_ ");
            }
            foundL = false;
        }
        System.out.println(foundWord);
        //foundWord = new StringBuilder();

        //Player 1 guesses a letter

    }
}
