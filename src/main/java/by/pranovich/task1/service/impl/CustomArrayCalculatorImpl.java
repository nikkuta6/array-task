package by.pranovich.task1.service.impl;

import by.pranovich.task1.entity.CustomArray;
import by.pranovich.task1.service.CustomArrayCalculator;
import org.jetbrains.annotations.NotNull;

public class CustomArrayCalculatorImpl implements CustomArrayCalculator {
    @Override
    public int calculateSum(@NotNull CustomArray customArray) {
        int sum = 0;
        int[] arr = customArray.getArray();

        for (int el : arr) {
            sum += el;
        }

        return sum;
    }

    @Override
    public double calculateAvgValue(@NotNull CustomArray customArray) {
        int sum = 0;
        int[] arr = customArray.getArray();

        for (int el : arr) {
            sum += el;
        }

        return (1. * sum / arr.length);
    }

    @Override
    public int calculatePositiveCount(@NotNull CustomArray customArray) {
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
    public int calculateNegativeCount(@NotNull CustomArray customArray) {
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
    public int calculateZeroCount(@NotNull CustomArray customArray) {
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
