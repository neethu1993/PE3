//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//
//import static org.junit.Assert.*;
//
//public class ChessBoardTest {
//    ChessBoard object;
//    @Before
//    public void setUp() {
//        object = new ChessBoard();
//    }
//
//    @After
//    public void tearDown() throws Exception {
//        object = null;
//    }
//    @Test
//    public void testChessBoardMethodSuccess() {
//        assertEquals(true,object.chessBoardMethod(4,4));
//    }
//
//    @Test
//    public void testChessBoardMethodFailure() {
//        assertNotEquals(true,object.chessBoardMethod(3,4));
//    }
//
//    @Test(expected = ArithmeticException.class)
//    public void testInvalidValue()
//    {
//        assertNotEquals(true,object.chessBoardMethod(3/0,4));
//
//    }
//}