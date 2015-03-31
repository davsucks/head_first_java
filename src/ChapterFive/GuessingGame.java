package ChapterFive;

/**
 * Created by David on 3/31/2015.
 */
public class GuessingGame {
    public static String NOTIFY_BAD_INPUT = "Please enter a properly formatted integer number!";
    public static String NOTIFY_TOO_LOW = "Your guess was too low";
    public static String NOTIFY_TOO_HIGH = "Your guess was too high";
    public static String NOTIFY_WIN = "You guessed it! Congratulations";
    public static String PROMPT = "Please enter a number between 1 and 100:";
    public GameHelper helper = new GameHelper();

    // first assign a random number between 1 and 100
    private int secretNumber = (int) Math.ceil((Math.random() * 100));

    protected String checkUserInput(String stringGuess) {
        int guess;

        try {
            guess = Integer.parseInt(stringGuess);
        } catch (NumberFormatException e) {
            return NOTIFY_BAD_INPUT;
        }

        if (guess < secretNumber) {
            return NOTIFY_TOO_LOW;
        } else if (guess > secretNumber) {
            return NOTIFY_TOO_HIGH;
        } else {
            return NOTIFY_WIN;
        }
    }

    public void play() {
        // loop forever until user guesses right
        while (true) {
            // collect user input as a guess
            String guess = helper.getUserInput(PROMPT);
            // determine if the user guessed too high or too low
            String result = checkUserInput(guess);
            System.out.println(result);

            if (result.equals(NOTIFY_WIN)) {
                break;
            }
        }
    }
}
