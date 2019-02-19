package com.stackroute.practice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculateDateTest {
    CalculateDate app;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void startDate()    {
        //Arrange
        boolean expectedValue = true;
        //Act
        boolean actualValue = app.endDate();
        //Assert
        assertEquals(expectedValue, actualValue);
        assertNotNull(actualValue);
    }


}