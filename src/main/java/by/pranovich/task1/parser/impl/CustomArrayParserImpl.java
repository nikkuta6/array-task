package by.pranovich.task1.parser.impl;

import by.pranovich.task1.parser.CustomArrayParser;

import java.util.Arrays;

public class CustomArrayParserImpl implements CustomArrayParser {
    public static final String CUSTOM_ARRAY_SPLIT_REGEX = "[\\s,.;-]+";

    @Override
    public int[] parse(String data) {
        String[] stringArray = data.strip().split(CUSTOM_ARRAY_SPLIT_REGEX);
        return Arrays.stream(stringArray)
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
