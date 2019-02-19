package com.stackroute.practice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveVowelsTest {
RemoveVowels app;
    @Before
    public void setUp() throws Exception {
        app=new RemoveVowels();
    }

    @After
    public void tearDown() throws Exception {
        app=null;
    }


    @Test
    public void test()
    {
        //Arrange
        String str[] = {"india", "germany"};
        String expectedValue[] = {"nd", "grmny"};
        //Act
        String actualValue[] = app.vowelRemove(str,2);
        //Assert
        assertArrayEquals(expectedValue, actualValue);
        assertNotNull(actualValue);
    }

}