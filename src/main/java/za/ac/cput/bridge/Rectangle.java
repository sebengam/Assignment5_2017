package za.ac.cput.bridge;

/**
 * Created by Tank on 4/2/2017.
 */
public class Rectangle extends Shape{

    Rectangle(Color color) {
        super(color);
    }

    public void colorIt() {
        System.out.print("Rectangle filled with ");
        color.fillColor();
    }
}
