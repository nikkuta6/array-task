package by.pranovich.task1.service.impl;

import by.pranovich.task1.entity.CustomArray;
import by.pranovich.task1.exception.CustomArrayException;
import by.pranovich.task1.service.CustomArrayManipulator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomArrayManipulatorImplTest {
    private CustomArrayManipulator manipulator;
    private CustomArray customArray;

    @BeforeEach
    void setUp() throws CustomArrayException {
        manipulator = new CustomArrayManipulatorImpl();
        customArray = CustomArray.newBuilder()
                .setId(1)
                .setArray(new int[]{1, 2, 3, 4, 5, 6, 1})
                .build();
    }

    @Test
    void replaceElByIndexTest() throws CustomArrayException {
        CustomArray expected = CustomArray.newBuilder()
                .setId(1)
                .setArray(new int[]{1, 2, 3, 0, 5, 6, 1})
                .build();
        int index = 3;
        int el = 0;
        CustomArray actual = manipulator.replaceElByIndex(index, el, customArray);

        assertEquals(expected, actual);
    }

    @Test
    void replaceFirstElByValueTest() throws CustomArrayException {
        CustomArray expected = CustomArray.newBuilder()
                .setId(1)
                .setArray(new int[]{1, 2, 3, 4, 5, 100, 1})
                .build();
        int value = 6;
        int el = 100;
        CustomArray actual = manipulator.replaceFirstElByValue(value, el, customArray);

        assertEquals(expected, actual);
    }

    @Test
    void replaceAllElByValueTest() throws CustomArrayException {
        CustomArray expected = CustomArray.newBuilder()
                .setId(1)
                .setArray(new int[]{52, 2, 3, 4, 5, 6, 52})
                .build();
        int value = 1;
        int el = 52;
        CustomArray actual = manipulator.replaceAllElByValue(value, el, customArray);

        assertEquals(expected, actual);
    }
}
