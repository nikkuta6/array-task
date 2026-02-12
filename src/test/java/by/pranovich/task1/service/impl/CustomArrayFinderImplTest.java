package by.pranovich.task1.service.impl;

import by.pranovich.task1.entity.CustomArray;
import by.pranovich.task1.exception.CustomArrayException;
import by.pranovich.task1.service.CustomArrayFinder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomArrayFinderImplTest {
    private CustomArrayFinder finder;
    private CustomArray customArray;

    @BeforeEach
    void setUp() throws CustomArrayException {
        finder = new CustomArrayFinderImpl();
        customArray = CustomArray.newBuilder()
                .setId(1)
                .setArray(new int[]{-14, 3, 1, 7, 0, 0, 88, -6})
                .build();
    }

    @Test
    void findMinTest() {
        int expected = -14;
        int actual = finder.findMin(customArray);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxTest() {
        int expected = 88;
        int actual = finder.findMax(customArray);

        assertEquals(expected, actual);
    }
}
