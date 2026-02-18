package by.pranovich.task1.service;

import by.pranovich.task1.entity.CustomArray;
import by.pranovich.task1.exception.CustomArrayException;

public interface CustomArraySorter {
    CustomArray bubbleSort(CustomArray customArray) throws CustomArrayException;

    CustomArray insertionSort(CustomArray customArray) throws CustomArrayException;

    CustomArray selectionSort(CustomArray customArray) throws CustomArrayException;
}
