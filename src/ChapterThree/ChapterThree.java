package ChapterThree;

/**
 * Create an array of 5 Rectangles (each with height and width instance
 * variables and an area() method). Find the average area of the rectangles.
 * Created by David on 3/30/2015.
 */
public class ChapterThree {

    public static void main(String[] args) {
        Rectangle[] myRects = new Rectangle[5];

        // create 5 new rectangles
        // set their width and height to random values
        // and add their area to the sum of areas
        double areaSum = 0.0;

        for (int i = 0; i < 5; ++i) {
            myRects[i] = new Rectangle();
            // assign height and width to random numbers between 0 and 100
            myRects[i].height = (Math.random() * 100);
            myRects[i].width = (Math.random() * 100);

            areaSum += myRects[i].area();
        }

        String formattedOutput = String.format("The average area of the rectangle is %.2f", areaSum / 5);
        System.out.println(formattedOutput);


    }
}
