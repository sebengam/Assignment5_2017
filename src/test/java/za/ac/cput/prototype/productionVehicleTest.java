package za.ac.cput.prototype;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Tank on 4/2/2017.
 */
public class productionVehicleTest {
    ProductionVehicle player;
    ProductionVehicle player2;


    @Before
    public void setUp() throws Exception {
        player = new ProductionVehicle("toyota","yaris");
        player2 = (ProductionVehicle) player.Copy();
    }

    @Test
    public void testClone() throws Exception {
        Assert.assertEquals(player.toString(),player2.toString());
    }
}
