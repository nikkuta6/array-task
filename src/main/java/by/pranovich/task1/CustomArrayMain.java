package by.pranovich.task1;

import by.pranovich.task1.entity.CustomArray;
import by.pranovich.task1.exception.CustomArrayException;

public class CustomArrayMain {
    public static void main(String[] args) throws CustomArrayException, CloneNotSupportedException {

        int[] numbers = new int[]{1, 2, 3};
        CustomArray customArray = null;
//        customArray = CustomArray.newBuilder().setId(1).setArray(numbers).build();
        System.out.println(customArray);
    }
}
