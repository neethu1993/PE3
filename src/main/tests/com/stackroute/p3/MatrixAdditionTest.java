package com.stackroute.p3;

import com.stackroute.p3.MatrixAddition;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixAdditionTest {
    private static MatrixAddition object;

    @Before
    public void setUp() {
        object = new MatrixAddition();
    }

    @After
    public void tearDown() throws Exception {
        object = null;
    }
    @Test
    public void testMatrixAdditionSuccess() {
        int[][] first={{1,2,3},{4,5,6}};
        int[][] second={{9,8,7},{6,5,4}};
        assertEquals(true,object.matrixAddition(2,3,2,3,first,second));
    }
    @Test
    public void testMatrixAdditionFailure() {
        int[][] first={{1,2,3},{4,5,6}};
        int[][] second={{9,8,7},{6,5,4}};
        assertNotEquals(true,object.matrixAddition(2,3,3,3,first,second));
    }
    @Test
    public void testMatrixAdditionNeutral() {

        assertNotEquals(true,object.matrixAddition(2,3,2,3,null,null));
    }
    @Test(expected = ArithmeticException.class)
    public void testInvalidValue()
    {
        assertNotEquals(true,object.matrixAddition(2/0,3,2,3,null,null));

    }

}