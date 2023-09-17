package org.example;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    void getSolution() {
        App app = new App();
        int[] array = {1, 3, 4, 5, 1, 5, 4};
        Map<Integer, Integer> expected = new HashMap<Integer, Integer>();
        expected.put(1,2);
        expected.put(3,1);
        expected.put(4,2);
        expected.put(5,2);
        Map<Integer, Integer> actual = app.getSolution(array);

        assertEquals(expected, actual);
    }
}
