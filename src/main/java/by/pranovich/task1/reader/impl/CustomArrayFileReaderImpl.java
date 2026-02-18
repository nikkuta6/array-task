package by.pranovich.task1.reader.impl;

import by.pranovich.task1.exception.CustomArrayException;
import by.pranovich.task1.reader.CustomArrayFileReader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class CustomArrayFileReaderImpl implements CustomArrayFileReader {

    @Override
    public List<String> readFile(String path) throws CustomArrayException {
        List<String> lines;
        try {
            lines = Files.readAllLines(Paths.get(path));
        } catch (IOException e) {
            throw new CustomArrayException("Error reading file " + e.getMessage());
        }

        return lines;
    }
}
