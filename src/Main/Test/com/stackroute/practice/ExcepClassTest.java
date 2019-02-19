package com.stackroute.practice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExcepClassTest {
ExcepClass app;
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void exception() {
        {
            //Arrange
            String expectedValue = "ExceptionCaught";
            //Act
            String actualValue = app.Exception(0);
            //Assert
            assertEquals(expectedValue, actualValue);
            assertNotNull(actualValue);
        }

    }
}