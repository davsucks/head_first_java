package ChapterFour;

/**
 * Created by David on 3/31/2015.
 */
public class Rectangle {
    double height = 0.0;
    double width = 0.0;

    Rectangle(double height_, double width_) {
        height = height_;
        width = width_;
    }

    public double area() {
        return height * width;
    }

    public double perimeter(){
        return (height*2) + (width*2);
    }
}
