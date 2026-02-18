package by.pranovich.task1.service.impl;

import by.pranovich.task1.entity.CustomArray;
import by.pranovich.task1.exception.CustomArrayException;
import by.pranovich.task1.service.CustomArrayFinder;
import org.jetbrains.annotations.NotNull;

public class CustomArrayFinderImpl implements CustomArrayFinder {
    @Override
    public int findMin(CustomArray customArray) throws CustomArrayException {
        if (customArray == null) {
            throw new CustomArrayException("Array can't be null!");
        }

        int[] arr = customArray.getArray();

        int min = arr[0];

        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }

        return min;
    }

    @Override
    public int findMax(CustomArray customArray) throws CustomArrayException {
        if (customArray == null) {
            throw new CustomArrayException("Array can't be null!");
        }

        int[] arr = customArray.getArray();

        int max = arr[0];

        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        return max;
    }
}
