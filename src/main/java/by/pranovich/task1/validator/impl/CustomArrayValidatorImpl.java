package by.pranovich.task1.validator.impl;

import by.pranovich.task1.entity.CustomArray;
import by.pranovich.task1.exception.CustomArrayException;
import by.pranovich.task1.factory.CustomArrayFactory;
import by.pranovich.task1.factory.impl.CustomArrayFactoryImpl;
import by.pranovich.task1.validator.CustomArrayValidator;

public class CustomArrayValidatorImpl implements CustomArrayValidator {
    public static final String CUSTOM_ARRAY_SPACE_REGEX = "^[\\d\\s\\p{P}]";

    @Override
    public boolean isValidCustomArray(CustomArray customArray) {
        if (customArray == null) {
            return false;
        }

        int[] arr = customArray.getArray();
        return (customArray.getId() > 0 && arr != null && arr.length > 0);
    }

    @Override
    public boolean isValidArrayField(int[] arr) {
        if (arr == null || arr.length == 0) {
            return false;
        }
        return true;
    }

    @Override
    public boolean isValidIdField(long id) {
        return false;
    }

    @Override
    public boolean isValidLine(String line) {
        return line.matches(CUSTOM_ARRAY_SPACE_REGEX);
    }
}
