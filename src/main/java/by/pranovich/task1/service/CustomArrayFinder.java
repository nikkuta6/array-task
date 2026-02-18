package by.pranovich.task1.service;

import by.pranovich.task1.entity.CustomArray;
import by.pranovich.task1.exception.CustomArrayException;

public interface CustomArrayFinder {
    int findMin(CustomArray customArray) throws CustomArrayException;

    int findMax(CustomArray customArray) throws CustomArrayException;
}
