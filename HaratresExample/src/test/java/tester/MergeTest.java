package tester;

import mergetool.Merge;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MergeTest {


    Merge merge;

    @BeforeEach
    void setUp() {
        merge = new Merge();
    }

    @Test
    void testEqualLengthContent() throws Exception {
        assertEquals("haratres", merge.merge("hrte","aars"));
    }
    @Test
    void testDifferentLengthContent() throws Exception {
        assertEquals("ababababcdefg", merge.merge("aaaa","bbbbcdefg"));
    }
    @Test
    void testZeroLengthContent() throws Exception {
        assertThrows(Exception.class,()->{merge.merge("","bbbbcdefg");} );
    }
}
