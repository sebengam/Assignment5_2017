package za.ac.cput.bridge;

/**
 * Created by Tank on 4/2/2017.
 */
public class Circle extends Shape {
    Circle(Color color) {
        super(color);
    }

    public void colorIt() {
        System.out.print("Circle filled with ");
        color.fillColor();
    }
}
