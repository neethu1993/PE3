package com.stackroute.p3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardTest {

    ChessBoard chessBoard;
    @Before
    public void setUp() throws Exception {
        chessBoard = new ChessBoard();
    }

    @After
    public void tearDown() throws Exception {
        chessBoard = null;
    }

    @Test
    public void testChessBoardMethodSuccess() {
        assertEquals(true,chessBoard.chessBoardMethod(8,8));
    }

    @Test
    public void testChessBoardMethodFailure(){
        assertFalse(chessBoard.chessBoardMethod(3,2));
    }

    @Test(expected = NullPointerException.class)
    public void testInvalid(){
        assertFalse(chessBoard.chessBoardMethod(0,0));
    }
}