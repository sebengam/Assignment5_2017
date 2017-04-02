package za.ac.cput.proxy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Tank on 4/2/2017.
 */
public class ProxyTest {
    File file;

    @Before
    public void setUp() throws Exception {
        file = FileProxy.getFileProxy("book.pdf");
    }

    @Test
    public void testFilename() throws Exception {

        Assert.assertSame(file.getFile(),"book.pdf");
    }
}
