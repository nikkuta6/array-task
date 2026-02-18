package by.pranovich.task1.service.impl;

import by.pranovich.task1.entity.CustomArray;
import by.pranovich.task1.exception.CustomArrayException;
import by.pranovich.task1.factory.CustomArrayFactory;
import by.pranovich.task1.factory.impl.CustomArrayFactoryImpl;
import by.pranovich.task1.service.CustomArrayManipulator;
import org.jetbrains.annotations.NotNull;

public class CustomArrayManipulatorImpl implements CustomArrayManipulator {
    @Override
    public CustomArray replaceElByIndex(int index, int el, @NotNull CustomArray customArray) throws CustomArrayException {
        CustomArrayFactory factory = new CustomArrayFactoryImpl();
        int[] arr = customArray.getArray();

        if (index < 0 || index >= arr.length) {
            throw new CustomArrayException("Can't replace element! Index out of bound!");
        }

        arr[index] = el;

        return factory.createCustomArray(customArray.getId(), arr);
    }

    @Override
    public CustomArray replaceFirstElByValue(int value, int el, @NotNull CustomArray customArray) throws CustomArrayException {
        CustomArrayFactory factory = new CustomArrayFactoryImpl();
        int[] arr = customArray.getArray();

        boolean hasValue = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                hasValue = true;
                arr[i] = el;
                break;
            }
        }

        if (!hasValue) {
            throw new CustomArrayException("Can't replace element! There is no such value in array!");
        }
        if (value == el) {
            throw new CustomArrayException("The old and new elements are the same! Operation has no sense!");
        }

        return factory.createCustomArray(customArray.getId(), arr);
    }

    @Override
    public CustomArray replaceAllElByValue(int value, int el, @NotNull CustomArray customArray) throws CustomArrayException {
        CustomArrayFactory factory = new CustomArrayFactoryImpl();
        int[] arr = customArray.getArray();

        boolean hasValue = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                hasValue = true;
                arr[i] = el;
            }
        }

        if (!hasValue) {
            throw new CustomArrayException("Can't replace element! There is no such value in array!");
        }
        if (value == el) {
            throw new CustomArrayException("The old and new elements are the same! Operation has no sense!");
        }

        return factory.createCustomArray(customArray.getId(), arr);
    }
}
