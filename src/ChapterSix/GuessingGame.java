package ChapterSix;
import java.util.ArrayList;


/**
 * Created by David on 3/31/2015.
 */
public class GuessingGame extends ChapterFive.GuessingGame {
    private ArrayList<String> userGuesses = new ArrayList<String>();

    public void printUserGuesses() {
        System.out.println("Here are your guesses in order: ");
        String output = "";
        for (String guess : userGuesses) {
            output += guess + ", ";
        }
        // remove the final comma and space
        output = output.substring(0, output.length() - 2);
        System.out.println(output);
    }

    public void play() {
        while (true) {
            String guess = helper.getUserInput(PROMPT);
            userGuesses.add(guess);

            String result = checkUserInput(guess);
            System.out.println(result);
            if (result.equals(NOTIFY_WIN)) {
                printUserGuesses();
                break;
            }
        }
    }
}
