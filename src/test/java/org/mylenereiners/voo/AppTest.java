package org.mylenereiners.voo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest{
    /**
     * Rigourous Test :-)
     */
    @Test
    public void testGreeting(){
        assertEquals( "Hello Fontys!", App.greeting("Fontys") );
    }
}
