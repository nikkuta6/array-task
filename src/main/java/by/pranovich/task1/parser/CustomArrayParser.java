package by.pranovich.task1.parser;

import by.pranovich.task1.exception.CustomArrayException;

public interface CustomArrayParser {
    int[] parse(String line) throws CustomArrayException;
}
