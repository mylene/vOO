package org.mylenereiners.voo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest {
    App app;

    @Before
    public void initializeApp() {
        app = new App();
    }

    @Test
    public void testGreeting() {
        assertEquals("Hello vOO-Java!", app.greeting("vOO-Java"));
    }

    @Test
    public void testNoGreeting() {
        assertEquals("Hello !", app.greeting(""));
    }
}
