package by.pranovich.task1.service;

import by.pranovich.task1.entity.CustomArray;
import by.pranovich.task1.exception.CustomArrayException;

public interface CustomArrayCalculator {
    int calculateSum(CustomArray customArray) throws CustomArrayException;

    double calculateAvgValue(CustomArray customArray) throws CustomArrayException;

    int calculatePositiveCount(CustomArray customArray) throws CustomArrayException;

    int calculateNegativeCount(CustomArray customArray) throws CustomArrayException;

    int calculateZeroCount(CustomArray customArray) throws CustomArrayException;
}
