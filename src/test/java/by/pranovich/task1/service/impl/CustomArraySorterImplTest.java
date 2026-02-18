package by.pranovich.task1.service.impl;

import by.pranovich.task1.entity.CustomArray;
import by.pranovich.task1.exception.CustomArrayException;
import by.pranovich.task1.factory.CustomArrayFactory;
import by.pranovich.task1.factory.impl.CustomArrayFactoryImpl;
import by.pranovich.task1.service.CustomArraySorter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomArraySorterImplTest {
    private CustomArraySorter sorter;
    private CustomArrayFactory factory;
    private CustomArray customArray;

    @BeforeEach
    void setUp() throws CustomArrayException {
        sorter = new CustomArraySorterImpl();
        factory = new CustomArrayFactoryImpl();
        customArray = factory.createCustomArray(1, new int[]{5, -7, 0, 9, 1, 0, -78});
    }

    @Test
    void bubbleSortTest() throws CustomArrayException {
        CustomArray expected = factory.createCustomArray(1, new int[]{-78, -7, 0, 0, 1, 5, 9});
        CustomArray actual = sorter.bubbleSort(customArray);

        assertEquals(expected, actual);
    }

    @Test
    void insertionSortTest() throws CustomArrayException {
        CustomArray expected = factory.createCustomArray(1, new int[]{-78, -7, 0, 0, 1, 5, 9});
        CustomArray actual = sorter.insertionSort(customArray);

        assertEquals(expected, actual);
    }

    @Test
    void selectionSortTest() throws CustomArrayException {
        CustomArray expected = factory.createCustomArray(1, new int[]{-78, -7, 0, 0, 1, 5, 9});
        CustomArray actual = sorter.selectionSort(customArray);

        assertEquals(expected, actual);
    }
}
