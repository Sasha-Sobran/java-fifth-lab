package ua.lviv.iot.algo.part1.lab5.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class PostalIndexFinderTest {
    @Test
    public void testFindPostalCodes() {
        String inputText = "Are there any Ukrainian postal codes among these: 12334, 98324, 12441?";
        List<Integer> inputRange = Arrays.asList(0, 89011);

        List<Integer> expected = Arrays.asList(12334, 12441);
        PostalCodeFinder textToFilter = new PostalCodeFinder(inputText, inputRange);
        Assertions.assertEquals(expected, textToFilter.findPostalCodes());
    }

}
