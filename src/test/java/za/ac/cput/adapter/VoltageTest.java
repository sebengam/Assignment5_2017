package za.ac.cput.adapter;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Tank on 4/2/2017.
 */
public class VoltageTest {
    LightAdapter voltClass,voltObj;

    @Before
    public void setUp() throws Exception {
        voltClass = new LightClassAdapter();
        voltObj =new LightObjectAdapter();
    }

    @Test
    public void testVoltCls() throws Exception {
        voltClass.get3Volt().setVolts(240);
        Assert.assertEquals(voltClass.get3Volt().getVolts(),6);
    }@Test
    public void testVoltObj() throws Exception {

        voltObj.get12Volt().setVolts(240);
        Assert.assertEquals(voltObj.get12Volt().getVolts(),24);

    }

}
