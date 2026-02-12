package by.pranovich.task1.validator.impl;

import by.pranovich.task1.entity.CustomArray;
import by.pranovich.task1.validator.CustomArrayValidator;

public class CustomArrayValidatorImpl implements CustomArrayValidator {

    @Override
    public boolean isValidArray(CustomArray customArray) {
        if (customArray == null) {
            return false;
        }

        int[] arr = customArray.getArray();
        return (arr != null && arr.length > 0);
    }
}
