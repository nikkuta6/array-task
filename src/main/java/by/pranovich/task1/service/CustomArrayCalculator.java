package by.pranovich.task1.service;

import by.pranovich.task1.entity.CustomArray;

public interface CustomArrayCalculator {
    int calculateSum(CustomArray customArray);

    double calculateAvgValue(CustomArray customArray);

    int calculatePositiveCount(CustomArray customArray);

    int calculateNegativeCount(CustomArray customArray);

    int calculateZeroCount(CustomArray customArray);
}
