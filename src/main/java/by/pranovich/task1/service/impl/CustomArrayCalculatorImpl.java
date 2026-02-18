package by.pranovich.task1.service.impl;

import by.pranovich.task1.entity.CustomArray;
import by.pranovich.task1.exception.CustomArrayException;
import by.pranovich.task1.service.CustomArrayCalculator;
import org.jetbrains.annotations.NotNull;

public class CustomArrayCalculatorImpl implements CustomArrayCalculator {
    @Override
    public int calculateSum(CustomArray customArray) throws CustomArrayException {
        if (customArray == null) {
            throw new CustomArrayException("Array can't be null!");
        }

        int sum = 0;
        int[] arr = customArray.getArray();

        for (int el : arr) {
            sum += el;
        }

        return sum;
    }

    @Override
    public double calculateAvgValue(CustomArray customArray) throws CustomArrayException {
        if (customArray == null) {
            throw new CustomArrayException("Array can't be null!");
        }

        int sum = 0;
        int[] arr = customArray.getArray();

        for (int el : arr) {
            sum += el;
        }

        return (1. * sum / arr.length);
    }

    @Override
    public int calculatePositiveCount(CustomArray customArray) throws CustomArrayException {
        if (customArray == null) {
            throw new CustomArrayException("Array can't be null!");
        }

        int count = 0;
        int[] arr = customArray.getArray();

        for (int el : arr) {
            if (el > 0) {
                count++;
            }
        }

        return count;
    }

    @Override
    public int calculateNegativeCount(CustomArray customArray) throws CustomArrayException {
        if (customArray == null) {
            throw new CustomArrayException("Array can't be null!");
        }

        int count = 0;
        int[] arr = customArray.getArray();

        for (int el : arr) {
            if (el < 0) {
                count++;
            }
        }

        return count;
    }

    @Override
    public int calculateZeroCount(CustomArray customArray) throws CustomArrayException {
        if (customArray == null) {
            throw new CustomArrayException("Array can't be null!");
        }

        int count = 0;
        int[] arr = customArray.getArray();

        for (int el : arr) {
            if (el == 0) {
                count++;
            }
        }

        return count;
    }
}
