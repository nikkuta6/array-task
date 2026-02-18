package by.pranovich.task1.service.impl;

import by.pranovich.task1.entity.CustomArray;
import by.pranovich.task1.exception.CustomArrayException;
import by.pranovich.task1.factory.CustomArrayFactory;
import by.pranovich.task1.factory.impl.CustomArrayFactoryImpl;
import by.pranovich.task1.service.CustomArraySorter;
import org.jetbrains.annotations.NotNull;

public class CustomArraySorterImpl implements CustomArraySorter {
    @Override
    public CustomArray bubbleSort(@NotNull CustomArray customArray) throws CustomArrayException {
        CustomArrayFactory factory = new CustomArrayFactoryImpl();
        int[] arr = customArray.getArray();

        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    isSorted = false;
                }
            }
        }

        return factory.createCustomArray(customArray.getId(), arr);
    }

    @Override
    public CustomArray insertionSort(@NotNull CustomArray customArray) throws CustomArrayException {
        CustomArrayFactory factory = new CustomArrayFactoryImpl();
        int[] arr = customArray.getArray();

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

        return factory.createCustomArray(customArray.getId(), arr);
    }

    @Override
    public CustomArray selectionSort(@NotNull CustomArray customArray) throws CustomArrayException {
        CustomArrayFactory factory = new CustomArrayFactoryImpl();
        int[] arr = customArray.getArray();

        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        return factory.createCustomArray(customArray.getId(),arr);
    }

}
