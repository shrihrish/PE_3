package com.stackroute.practice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardTest {
    ChessBoard app;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void chess()    {
        //Arrange
        String[][] expectedValue = {{"WW", "BB"}, {"BB", "WW"}};
        ;
        //Act
        String[][] actualValue = app.chess(2, 2);
        //Assert
        assertArrayEquals(expectedValue, actualValue);
        assertNotNull(actualValue);
    }
}