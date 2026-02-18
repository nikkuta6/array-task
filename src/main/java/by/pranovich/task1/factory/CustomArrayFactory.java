package by.pranovich.task1.factory;

import by.pranovich.task1.entity.CustomArray;
import by.pranovich.task1.exception.CustomArrayException;

public interface CustomArrayFactory {
    CustomArray createCustomArray(long id, int[] array) throws CustomArrayException;
}
