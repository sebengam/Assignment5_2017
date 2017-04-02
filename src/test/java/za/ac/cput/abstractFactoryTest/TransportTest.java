package za.ac.cput.abstractFactoryTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.abstractFactory.AbstractFactory;
import za.ac.cput.abstractFactory.FactoryType;
import za.ac.cput.abstractFactory.transport.Transport;

/**
 * Created by Tank on 4/2/2017.
 */
public class TransportTest {


    AbstractFactory AF;
    FactoryType FT;
    FactoryType FT2;
    Transport t1;
    Transport t2;

    @Before
    public void setUp() throws Exception {

        AF = AbstractFactory.getAbstrctF();
        FT =  AF.getFactory("Ship");
        FT2 =  AF.getFactory("Vehicle");
        t1 = FT.getTransport("Submarine");
        t2 = FT2.getTransport("Sedan");
    }

    @Test
    public void testTransport() throws Exception {

        Assert.assertEquals("Sedan",t2.getName());
    }
    @Test
    public void testShip() throws Exception {

        Assert.assertEquals("Sedan",t1.getName());
    }

}
