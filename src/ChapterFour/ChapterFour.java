package ChapterFour;

/**
 * Create a new version of the Chapter 3 exercise where you pass the height and width
 * into the Rectangle constructor and initialize the instance variables there.
 * Add a perimeter() method to Rectangle.
 * Print the total area of all rectangles.
 * Print the total perimeter of all rectangles.
 * Created by David on 3/31/2015.
 */
public class ChapterFour {
    public static void main(String[] args) {
        Rectangle[] myRects = new Rectangle[5];

        // loop through five times, create each rectangle
        // and add each perimeter and area to their respective sums
        double totalPerimeter = 0.0;
        double totalArea = 0.0;

        for (int i = 0; i < 5; ++i) {
            myRects[i] = new Rectangle((Math.random() * 100), (Math.random() * 100));
            totalPerimeter += myRects[i].perimeter();
            totalArea += myRects[i].area();
        }

        String formattedOutput = String.format("The total perimeter of all the rectangles is %.2f", totalPerimeter);
        System.out.println(formattedOutput);

        formattedOutput = String.format("The total area of all the rectangles is %.2f", totalArea);
        System.out.println(formattedOutput);
    }
}
