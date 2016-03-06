package com.deronlee.test.character;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Created by lnc on 3/6/2016.
 */
public class KingTest extends TestCase{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public KingTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( KingTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        King king = new King();
        king.fight();
        assertTrue( true );
    }
}
