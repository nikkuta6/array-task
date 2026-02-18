package by.pranovich.task1;

import by.pranovich.task1.entity.CustomArray;
import by.pranovich.task1.exception.CustomArrayException;
import by.pranovich.task1.factory.CustomArrayFactory;
import by.pranovich.task1.factory.impl.CustomArrayFactoryImpl;
import by.pranovich.task1.parser.CustomArrayParser;
import by.pranovich.task1.parser.impl.CustomArrayParserImpl;
import by.pranovich.task1.reader.CustomArrayFileReader;
import by.pranovich.task1.reader.impl.CustomArrayFileReaderImpl;
import by.pranovich.task1.validator.CustomArrayValidator;
import by.pranovich.task1.validator.impl.CustomArrayValidatorImpl;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CustomArrayMain {
    public static void main(String[] args) {
        CustomArrayFileReader reader = new CustomArrayFileReaderImpl();
        CustomArrayParser parser = new CustomArrayParserImpl();
        CustomArrayValidator validator = new CustomArrayValidatorImpl();
        CustomArrayFactory factory = new CustomArrayFactoryImpl();
        String path = "data/text.txt";
        long id = 1;
        List<CustomArray> result = new ArrayList<>();

        try {
            List<String> data = reader.readFileLines(path);

            for (String line : data) {
                if (validator.isValidLine(line)) {
                    int[] arr = parser.parse(line);

                    CustomArray customArray = factory.createCustomArray(id++, arr);
                    result.add(customArray);
                }
            }
        } catch (CustomArrayException e) {
            e.printStackTrace();
        }
        System.out.println(result);
    }
}
