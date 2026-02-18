package by.pranovich.task1.parser.impl;

import by.pranovich.task1.exception.CustomArrayException;
import by.pranovich.task1.parser.CustomArrayParser;

import java.util.Arrays;

public class CustomArrayParserImpl implements CustomArrayParser {
    public static final String CUSTOM_ARRAY_SEPARATOR_REGEX = "[\\s,.:!?;\\-a-zA-Z]+";

    @Override
    public int[] parse(String line) throws CustomArrayException {
        if (line == null) {
            throw new CustomArrayException("Line can't be null!");
        }

        String[] lines = line.trim().split(CUSTOM_ARRAY_SEPARATOR_REGEX);

        return Arrays.stream(lines)
                .filter(str -> !str.isEmpty())
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
