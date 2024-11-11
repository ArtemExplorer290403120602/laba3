package org.example;

import java.util.Arrays;
import java.util.List;

//Проверить, что один список содержится в другом
public class Z6 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, -1, -2);
        List<Integer> newNumbers = Arrays.asList(1, 13, -4, -3);
        List<Integer> newTwoNubmers = Arrays.asList(1, 2);
        boolean test = numbers.containsAll(newNumbers);
        boolean test2 = numbers.containsAll(newTwoNubmers);
        System.out.println("Содержит ли список : " + newNumbers + " || " + test);
        System.out.println("------------------------");
        System.out.println("Содержит ли список : " + newTwoNubmers + " || " + test2);
    }
}
