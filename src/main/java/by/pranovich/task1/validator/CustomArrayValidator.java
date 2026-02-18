package by.pranovich.task1.validator;

import by.pranovich.task1.entity.CustomArray;
import by.pranovich.task1.exception.CustomArrayException;

public interface CustomArrayValidator {
    boolean isValidCustomArray(CustomArray customArray);

    boolean isValidArrayField(int[] arr);

    boolean isValidIdField(long id);

    boolean isValidLine(String line);
}
