package org.example;

import java.util.Arrays;
import java.util.List;

//Найти сумму всех положительных элементов списка
public class Z9 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, -1, -2);
        int sum = numbers.stream()
                .filter(n -> n > 0)
                .reduce(0, Integer::sum);
        System.out.println("Итог : " + sum);
    }
}