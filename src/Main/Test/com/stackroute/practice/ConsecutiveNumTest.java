package com.stackroute.practice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveNumTest {
    ConsecutiveNum app;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test()
    {
        //Arrange
        boolean expectedValue = false;
        int[] a = {1, 2, 4};

        //Act
        boolean actualValue = app.consecutive(a, 3);
        //Assert
        assertEquals(expectedValue, actualValue);
        assertNotNull(actualValue);
    }

}