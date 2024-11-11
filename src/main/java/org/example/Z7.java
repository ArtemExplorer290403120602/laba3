package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//Составить список, содержащий разности соседних элементов заданного списка
public class Z7 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 5, 5, 6, -1, -2);
        List<Integer> differences = IntStream.range(0, numbers.size() - 1)
                .map(i -> numbers.get(i + 1) - numbers.get(i))
                .boxed()
                .collect(Collectors.toList());
        System.out.println("Разности соседних элементов: " + differences);
    }
}