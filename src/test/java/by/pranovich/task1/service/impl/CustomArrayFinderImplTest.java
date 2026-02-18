package by.pranovich.task1.service.impl;

import by.pranovich.task1.entity.CustomArray;
import by.pranovich.task1.exception.CustomArrayException;
import by.pranovich.task1.factory.CustomArrayFactory;
import by.pranovich.task1.factory.impl.CustomArrayFactoryImpl;
import by.pranovich.task1.service.CustomArrayFinder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomArrayFinderImplTest {
    private CustomArrayFinder finder;
    private CustomArrayFactory factory;
    private CustomArray customArray;

    @BeforeEach
    void setUp() throws CustomArrayException {
        finder = new CustomArrayFinderImpl();
        factory = new CustomArrayFactoryImpl();
        customArray = factory.createCustomArray(1, new int[]{-14, 3, 1, 7, 0, 0, 88, -6});
    }

    @Test
    void findMinTest() throws CustomArrayException {
        int expected = -14;
        int actual = finder.findMin(customArray);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxTest() throws CustomArrayException {
        int expected = 88;
        int actual = finder.findMax(customArray);

        assertEquals(expected, actual);
    }
}
