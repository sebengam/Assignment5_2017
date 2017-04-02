package za.ac.cput.bridge;

/**
 * Created by Tank on 4/2/2017.
 */
public abstract class Shape {
    Color color;
    Shape(Color color)
    {
        this.color=color;
    }
    abstract public void colorIt();
}
