package com.stackroute.p3;

import com.stackroute.p3.StudentMark;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class StudentMarkTest {
    private static StudentMark studentMark;

    /*Class object setup, performs before entering a test case
     */

    @Before
    public void setUp() {
        studentMark = new StudentMark();
    }

    /*Class object teardown, performs after entering a test case
     */

    @After
    public void tearDown() throws Exception {
        studentMark = null;
    }

    /*Test cases */
    @Test
    public void testGetStudentMarksSuccess() {
        //Arrange
        Boolean expectedValue = true;
        List<Integer> grade = new ArrayList<Integer>();
        grade.add(22);
        grade.add(55);
        grade.add(99);
        //Act and Assert
        assertEquals(expectedValue,studentMark.getStudentMarks(grade));
    }

    @Test
    public void testGetStudentMarksFailure() {
        //Arrange
        Boolean expectedValue = true;
        List<Integer> grade = new ArrayList<Integer>();
        grade.add(22);
        grade.add(55);
        grade.add(99);
        grade.add(122);
        //Act and Assert
        assertNotEquals(expectedValue,studentMark.getStudentMarks(grade));
    }

    @Test
    public void testGetStudentMarksInvalid() {
        //Arrange
        Boolean expectedValue = true;
        List<Integer> grade = new ArrayList<Integer>();
        grade.add(22);
        grade.add(55);
        grade.add(99);
        grade.add(-9);
        //Act and Assert
        assertNotEquals(expectedValue,studentMark.getStudentMarks(grade));
    }

    @Test(expected = ArithmeticException.class)
    public void testInvalidValue()
    {
        //Arrange
        List<Integer> grade = new ArrayList<Integer>();
        grade.add(40/0);  //Arithmetic Exception raised here
        grade.add(55);
        grade.add(99);

    }

}
