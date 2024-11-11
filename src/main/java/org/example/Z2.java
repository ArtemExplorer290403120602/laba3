package org.example;

import java.util.Arrays;
import java.util.List;
// 2. Нахождение суммы всех элементов списка, не превосходящих заданное значение
public class Z2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, -1, -2);
        int mainNumber = 5;
        int sum = numbers.stream()
                .filter(n-> n<=mainNumber)
                .reduce(0,Integer::sum);
        System.out.println("Итог : " + sum);
    }
}
