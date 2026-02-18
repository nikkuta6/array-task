package by.pranovich.task1.factory.impl;

import by.pranovich.task1.entity.CustomArray;
import by.pranovich.task1.exception.CustomArrayException;
import by.pranovich.task1.factory.CustomArrayFactory;

public class CustomArrayFactoryImpl implements CustomArrayFactory {
    @Override
    public CustomArray createCustomArray(long id, int[] array) throws CustomArrayException {
        return new CustomArray(id, array);
    }
}
