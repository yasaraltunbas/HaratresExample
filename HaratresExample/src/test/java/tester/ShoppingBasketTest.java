package tester;

import mergetool.Merge;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import shoppingbasket.ShoppingBasket;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ShoppingBasketTest {
    ShoppingBasket shoppingBasket;

    @BeforeEach
    void setUp() {
        shoppingBasket = new ShoppingBasket();
    }

    @Test
    void testTruePriceValue() throws Exception {
        assertEquals(15, shoppingBasket.calculatePrice(new int[]{5, 6, 4, 3, 4}));
    }

    @Test
    void testValueOverThan2000() throws Exception {
        assertThrows(Exception.class,()->{shoppingBasket.calculatePrice(new int[]{25,30,2900,3,9});} );

    }
    @Test
        void testValueLowerThanZero() throws Exception {
        assertThrows(Exception.class,()->{shoppingBasket.calculatePrice(new int[]{0,30,-5,3,9});} );

    }
    @Test
    void testDimensionZero() throws Exception {
        assertThrows(Exception.class,()->{shoppingBasket.calculatePrice(new int[]{});} );

    }
}

