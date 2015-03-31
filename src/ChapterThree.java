/**
 * Create an array of 5 Rectangles (each with height and width instance
 * variables and an area() method). Find the average area of the rectangles.
 * Created by David on 3/30/2015.
 */
public class ChapterThree {

    public static void main(String[] args) {
        RectangleChapterThree[] myRects = new RectangleChapterThree[5];

        // create 5 new rectangles
        // set their width and height to random values
        // and add their area to the sum of areas
        int areaSum = 0;
        for (int i = 0; i < 5; ++i) {
            myRects[i] = new RectangleChapterThree();
            // assign height and width to random numbers between 0 and 100
            myRects[i].height = (Math.random() * 100);
            myRects[i].width = (Math.random() * 100);

            areaSum += myRects[i].area();
        }

        System.out.println("The average area of the rectangles is " + areaSum / 5);


    }
}
