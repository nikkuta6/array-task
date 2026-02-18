package by.pranovich.task1.service.impl;

import by.pranovich.task1.entity.CustomArray;
import by.pranovich.task1.exception.CustomArrayException;
import by.pranovich.task1.factory.CustomArrayFactory;
import by.pranovich.task1.factory.impl.CustomArrayFactoryImpl;
import by.pranovich.task1.service.CustomArrayManipulator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomArrayManipulatorImplTest {
    private CustomArrayManipulator manipulator;
    private CustomArrayFactory factory;
    private CustomArray customArray;

    @BeforeEach
    void setUp() throws CustomArrayException {
        manipulator = new CustomArrayManipulatorImpl();
        factory = new CustomArrayFactoryImpl();
        customArray = factory.createCustomArray(1, new int[]{1, 2, 3, 4, 5, 6, 1});
    }

    @Test
    void replaceElByIndexTest() throws CustomArrayException {
        CustomArray expected = factory.createCustomArray(1, new int[]{1, 2, 3, 0, 5, 6, 1});
        int index = 3;
        int el = 0;
        CustomArray actual = manipulator.replaceElByIndex(index, el, customArray);

        assertEquals(expected, actual);
    }

    @Test
    void replaceFirstElByValueTest() throws CustomArrayException {
        CustomArray expected = factory.createCustomArray(1, new int[]{1, 2, 3, 4, 5, 100, 1});
        int value = 6;
        int el = 100;
        CustomArray actual = manipulator.replaceFirstElByValue(value, el, customArray);

        assertEquals(expected, actual);
    }

    @Test
    void replaceAllElByValueTest() throws CustomArrayException {
        CustomArray expected = factory.createCustomArray(1, new int[]{52, 2, 3, 4, 5, 6, 52});
        int value = 1;
        int el = 52;
        CustomArray actual = manipulator.replaceAllElByValue(value, el, customArray);

        assertEquals(expected, actual);
    }
}
