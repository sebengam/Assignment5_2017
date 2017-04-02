package za.ac.cput.ChainOfResponsibility;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.ChainOfReposibility.*;

/**
 * Created by Tank on 4/2/2017.
 */
public class GradeHandleTest {
    GradeHandler gdh,gch,gbh,gah;

    @Before
    public void setUp() throws Exception {
        gah = new GradeAHandler();
        gbh = new GradeBHandler();
        gch = new GradeCHandler();
        gdh = new GradeDHandler();

    }

    @Test
    public void testGrade() throws Exception {
        gah.setSuccessor(gbh);
        gbh.setSuccessor(gch);
        gch.setSuccessor(gdh);


        gah.handleRequest(78);
        gah.handleRequest(72);
        gah.handleRequest(67);
        gah.handleRequest(61);
    }
}
