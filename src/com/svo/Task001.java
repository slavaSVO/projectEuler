package com.svo;
/*
Задача 1
Числа, кратные 3 или 5
Если выписать все натуральные числа меньше 10, кратные 3 или 5, то получим 3, 5, 6 и 9. Сумма этих чисел равна 23.
Найдите сумму всех чисел меньше 1000, кратных 3 или 5.
 */

import java.util.ArrayList;

public class Task001 {
    private final static long MAX_VALUE = 1000L;

    Task001() {//ініціалізація класса
    }

    private boolean isMultiple(long value, long base) {//Перевіряє чи value  кратне base
        if (value % base == 0) {//Цілочислове ділення
            return true;
        } else {
            return false;
        }
    }

    long getAnswer() {
        long sum = 0;
        for (int i = 0; i < MAX_VALUE; i++) {
            boolean isMultiple3 = isMultiple(i, 3);//перевіряємо чи число кратне 3
            boolean isMultiple5 = isMultiple(i, 5);//перевіряємо чи число кратне 5
            if (isMultiple3 || isMultiple5)
                sum = sum + i;
        }
        return sum;
    }
}
