package by.pranovich.task1.validator.impl;

import by.pranovich.task1.validator.CustomArrayValidator;

public class CustomArrayValidatorImpl implements CustomArrayValidator {
    public static final String VALID_LINE_REGEX = "^[0-9a-zA-Z\\s,.:!?;\\-]+$";

    @Override
    public boolean isValidLine(String line) {
        if (line == null) {
            return false;
        }
        return line.matches(VALID_LINE_REGEX);
    }
}
