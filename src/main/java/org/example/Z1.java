package org.example;

import java.util.Arrays;
import java.util.List;
// Нахождения суммы всех элементов списка
public class Z1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, -1, -2);
        int sum = numbers.stream().reduce(0,Integer::sum);
        System.out.println("Сумма всех элемнтов : " + sum);
    }
}
