package by.pranovich.task1.reader.impl;

import by.pranovich.task1.exception.CustomArrayException;
import by.pranovich.task1.reader.CustomArrayFileReader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomArrayFileReaderImpl implements CustomArrayFileReader {

    @Override
    public List<String> readFileLines(String filePath) throws CustomArrayException {
        Path path = Paths.get(filePath);

        if (!Files.exists(path)) {
            throw new CustomArrayException("File not found: " + filePath);
        }

        try (Stream<String> lines = Files.lines(path)) {
            return lines
                    .map(String::strip)
                    .filter(line -> !line.isEmpty())
                    .collect(Collectors.toList());
        } catch (IOException e) {
            throw new CustomArrayException("Error reading file: " + e.getMessage());
        }
    }
}
