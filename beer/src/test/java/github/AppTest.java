package github;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    public void newTest()
    {
      fail();
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        //Just a comment
        assertTrue( true );
    }

    public void testMoreAndMore()
    {
        assertTrue("More And More", true);  
    }
}
