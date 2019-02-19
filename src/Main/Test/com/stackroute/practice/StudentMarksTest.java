package com.stackroute.practice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {
    StudentMarks app;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test()  {
        //Arrange
        boolean expectedValue = false;
        int[] a = {12, 122, 11};

        //Act
        boolean actualValue = app.StudentMarks(3, a);
        //Assert
        assertEquals(expectedValue, actualValue);
        assertNotNull(actualValue);
    }


}