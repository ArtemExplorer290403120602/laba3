package org.example;

import java.util.Arrays;
import java.util.List;

//Найти сумму всех четных элементов списка
public class Z5 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, -1, -2);
        int sum = numbers.stream()
                .filter(n -> n % 2 == 0)
                .reduce(0, Integer::sum);
        System.out.println("Итог : " + sum);
    }
}