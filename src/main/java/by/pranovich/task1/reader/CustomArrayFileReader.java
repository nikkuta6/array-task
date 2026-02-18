package by.pranovich.task1.reader;

import by.pranovich.task1.exception.CustomArrayException;

import java.util.List;

public interface CustomArrayFileReader {
    List<String> readFile(String path) throws CustomArrayException;
}
