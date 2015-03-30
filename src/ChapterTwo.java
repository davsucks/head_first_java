/**
 * Create a class that counts how many times you call the method increment()
 * and prints out that number when you call total(). Create a main method that
 * calls increment 5 times and then calls total.
 * Created by David on 3/30/2015.
 */
public class ChapterTwo {
    static int count = 0;

    public static void increment() {
        ++count;
    }

    public static void total() {
        System.out.println("You have called increment " + count + " times");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; ++i) {
            increment();
        }
        total();
    }
}
