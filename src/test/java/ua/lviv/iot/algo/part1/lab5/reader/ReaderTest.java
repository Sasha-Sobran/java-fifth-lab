package ua.lviv.iot.algo.part1.lab5.reader;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

public class ReaderTest {
    @Test
    public void testReadText() {
        String input = "ukrainian postalIndex 12334 98324 12441";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        String result = new PostalCodeReader().readText();
        Assertions.assertEquals(input, result);
    }

    @Test
    public void testReadRange() {
        String input = "123 312\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        List<Integer> expected = Arrays.asList(123, 312);
        List<Integer> result = new PostalCodeReader().readRange();

        Assertions.assertEquals(expected, result);
    }
}