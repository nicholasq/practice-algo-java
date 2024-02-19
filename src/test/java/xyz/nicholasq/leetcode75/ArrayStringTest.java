package xyz.nicholasq.leetcode75;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ArrayStringTest {


    @ParameterizedTest
    @CsvSource({
            "'abc', 'def', 'adbecf'",
            "'ac', 'efgh', 'aecfgh'",
            "'', '', ''",
            "'a', '', 'a'",
            "'', 'b', 'b'",
    })
    public void testMergeStringsAlternatively(String one, String two, String expected) {
        var arrayString = new ArrayString();
        var actual = arrayString.mergeAlternately(one, two);
        Assertions.assertEquals(expected, actual);
    }
}
