package org.example;

import java.util.Arrays;
import java.util.List;

//Нахождение числа вхождений данного элемента в список
public class Z4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, -1, -2, 4);
        int count = 4;
        long sum = numbers.stream()
                .filter(n -> n == count)
                .count();
        System.out.println("Число вхождений элемента " + count + ": " + sum);
    }
}