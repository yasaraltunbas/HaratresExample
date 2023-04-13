package tester;

import closenumberproblem.CloseNumberProblem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CloseNumberTest {

    CloseNumberProblem closeNumberProblem;

    @BeforeEach
    void setUp() {
        closeNumberProblem = new CloseNumberProblem();
    }

    @Test
    void testClosestNumber() throws Exception {
        assertArrayEquals(new String[] {"12 15","32 35"}, closeNumberProblem.findCloses(new int[]{32, 41, 12 , 15, 21, 32, 48, 35}));
    }
    @Test
    void testValueOverThan20000() throws Exception {
        assertThrows(Exception.class,()->{closeNumberProblem.findCloses(new int[]{0,30,200000,3,9});} );

    }
    @Test
    void testValueLowerThanNegative20000() throws Exception {
        assertThrows(Exception.class,()->{closeNumberProblem.findCloses(new int[]{4, 41, 12 , 15, 21, 32, 48, -200000});} );

   }
    @Test
    void testDimensionZero() throws Exception {
        assertThrows(Exception.class,()->{closeNumberProblem.findCloses(new int[]{});} );

    }
}
