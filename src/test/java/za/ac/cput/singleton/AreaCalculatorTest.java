package za.ac.cput.singleton;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Tank on 4/2/2017.
 */
public class AreaCalculatorTest {
    AreaCalculator area;

    @Before
    public void setUp() throws Exception {
        area = AreaCalculator.getInstance();
    }

    @Test
    public void testArea() throws Exception {
        assertEquals(area.calculate(4.2, 3.0) , area.calculate(4.2, 3.0));
    }
}


