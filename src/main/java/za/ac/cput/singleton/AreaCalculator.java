package za.ac.cput.singleton;

/**
 * Created by Tank on 4/2/2017.
 */
public class AreaCalculator {

        private static AreaCalculator calcArea= null;

        private AreaCalculator() {
        }

        public static AreaCalculator getInstance(){
            if(calcArea ==null){
                calcArea = new AreaCalculator();
            }
            return calcArea;
        }

        public double calculate(double width, double length) {
            return width*length;
        }


}
