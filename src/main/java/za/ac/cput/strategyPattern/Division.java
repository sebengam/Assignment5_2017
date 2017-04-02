package za.ac.cput.strategyPattern;

/**
 * Created by Tank on 4/2/2017.
 */
public class Division implements Calculator {

    @Override
    public int doCalculation(int num1, int num2) {
        return num1 / num2;
    }
}
