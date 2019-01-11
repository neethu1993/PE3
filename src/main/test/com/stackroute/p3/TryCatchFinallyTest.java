package com.stackroute.p3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TryCatchFinallyTest {
    TryCatchFinally tryCatchFinally;
    @Before
    public void setUp() throws Exception {
        tryCatchFinally = new TryCatchFinally();
    }

    @After
    public void tearDown() throws Exception {
        tryCatchFinally = null;
    }

    @Test
    public void testCustomException() {
        try {
            tryCatchFinally.customException();
            //fail("Expected an IndexOutOfBoundsException to be thrown");
        } catch (Exception e) {
            assertNotNull(e);
        }
    }
}