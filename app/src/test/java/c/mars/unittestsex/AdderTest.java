package c.mars.unittestsex;

import junit.framework.TestCase;

/**
 * Created by mars on 7/15/15.
 */
public class AdderTest extends TestCase {

    Adder adder;
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        adder=new Adder();
    }

    public void testAdd() throws Exception {
        assertEquals(4, adder.add(2,2));
    }
}