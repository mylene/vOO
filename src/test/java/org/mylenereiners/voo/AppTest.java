package org.mylenereiners.voo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest{
    /**
     * Rigourous Test :-)
     */
    @Test
    public void testGreeting(){
        assertEquals( "Hello Test!", App.greeting("Test") );
    }
}
