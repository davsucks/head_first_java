package ChapterFive;
import java.io.*;

/**
 * A lot of this code is taken verbatim from Head First Java: Chapter 5 from the GameHelper class
 * Created by David on 3/31/2015.
 */
public class GameHelper {
    public String getUserInput(String prompt) {
        String inputLine = null;
        System.out.println(prompt);
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0) {
                return null;
            }
        } catch (IOException e) { e.printStackTrace(); }
        return inputLine;
    }
}
