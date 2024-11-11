package org.example;

import java.util.Arrays;
import java.util.List;

// 3. Нахождение суммы половины элементов списка (четное число элементов)
public class Z3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, -1, -2);
        if (numbers.size() % 2 == 0) {
            int sum = numbers.stream()
                    .limit(numbers.size() / 2)
                    .reduce(0, Integer::sum);
            System.out.println("Итог : " + sum);
        } else {
            System.out.println("Не четное количество элементов");
        }
    }
}
