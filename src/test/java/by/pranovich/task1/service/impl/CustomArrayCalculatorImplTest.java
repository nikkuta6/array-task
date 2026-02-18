package by.pranovich.task1.service.impl;

import by.pranovich.task1.entity.CustomArray;
import by.pranovich.task1.exception.CustomArrayException;
import by.pranovich.task1.factory.CustomArrayFactory;
import by.pranovich.task1.factory.impl.CustomArrayFactoryImpl;
import by.pranovich.task1.service.CustomArrayCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomArrayCalculatorImplTest {
    private CustomArrayCalculator calculator;
    private CustomArrayFactory factory;
    private CustomArray customArray;

    @BeforeEach
    void setUp() throws CustomArrayException {
        calculator = new CustomArrayCalculatorImpl();
        factory = new CustomArrayFactoryImpl();
        customArray = factory.createCustomArray(1, new int[]{-7, 0, 1, 44, 13, 0, 9});
    }

    @Test
    void calculateSumTest() {
        int expected = 60;
        int actual = calculator.calculateSum(customArray);

        assertEquals(expected, actual);
    }

    @Test
    void calculateAvgValueTest() {
        double expected = 8.571428;
        double actual = calculator.calculateAvgValue(customArray);
        double delta = 0.000001;

        assertEquals(expected, actual, delta);
    }

    @Test
    void calculatePositiveCountTest() {
        int expected = 4;
        int actual = calculator.calculatePositiveCount(customArray);

        assertEquals(expected, actual);
    }

    @Test
    void calculateNegativeCountTest() {
        int expected = 1;
        int actual = calculator.calculateNegativeCount(customArray);

        assertEquals(expected, actual);
    }

    @Test
    void calculateZeroCountTest() {
        int expected = 2;
        int actual = calculator.calculateZeroCount(customArray);

        assertEquals(expected, actual);
    }

}
