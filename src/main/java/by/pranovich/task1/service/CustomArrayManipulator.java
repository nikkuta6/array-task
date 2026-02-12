package by.pranovich.task1.service;

import by.pranovich.task1.entity.CustomArray;
import by.pranovich.task1.exception.CustomArrayException;

public interface CustomArrayManipulator {
    CustomArray replaceElByIndex(int index, int el, CustomArray customArray) throws CustomArrayException;

    CustomArray replaceFirstElByValue(int value, int el, CustomArray customArray) throws CustomArrayException;

    CustomArray replaceAllElByValue(int value, int el, CustomArray customArray) throws CustomArrayException;

}
