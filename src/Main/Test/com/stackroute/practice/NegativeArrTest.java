package com.stackroute.practice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NegativeArrTest {
    NegativeArr app;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void checkExcepetion(){
        //Arrange
        int a[] = {1, -2, 3};
        String expectedValue = "NegativeArraySizeException";
        //Act
        String actualValue = app.checkExcepetion(a, 3);
        //Assert
        assertEquals(expectedValue, actualValue);
        assertNotNull(actualValue);
    }
}