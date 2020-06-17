package com.svo;

import java.util.ArrayList;

/*
Задача 2
Четные числа Фибоначчи
Каждый следующий элемент ряда Фибоначчи получается при сложении двух предыдущих. Начиная с 1 и 2, первые 10 элементов будут:
1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
Найдите сумму всех четных элементов ряда Фибоначчи, которые не превышают четыре миллиона.
 */
public class Task002 {
    private ArrayList<Long> rowOfFibonacci = new ArrayList<Long>();
    private static final long MAX_VALUE = 4_000_000;

    Task002() {
        createRowOfFibonacci();
    }

    private void createRowOfFibonacci() {
        rowOfFibonacci.add(1L);
        rowOfFibonacci.add(2L);
        int i = 2;
        while (rowOfFibonacci.get(rowOfFibonacci.size() - 1) < MAX_VALUE) {
            rowOfFibonacci.add(rowOfFibonacci.get(i - 1) + rowOfFibonacci.get(i - 2));
            i++;
        }
        rowOfFibonacci.remove(rowOfFibonacci.size() - 1);
    }

    private boolean isMultiple(long value, long base) {//Перевіряє чи value  кратне base
        if (value % base == 0) {//Цілочислове ділення
            return true;
        } else {
            return false;
        }
    }

    public long getAnswer (){
        long sum = 0L;
        for (int i = 0; i < rowOfFibonacci.size(); i++) {
            if (isMultiple(rowOfFibonacci.get(i), 2)){
                sum = sum + rowOfFibonacci.get(i);
            }
        }
        return sum;
    }
}
