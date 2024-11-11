package org.example;

import java.util.Arrays;
import java.util.List;

//Найти среднее значение элементов списка
public class Z8 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, -1, -2);
        double sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);
        System.out.println("Итог : " + sum);
    }
}