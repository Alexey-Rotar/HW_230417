// 3) Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.

package org.example.hw230417.task3;

import java.util.Arrays;

public class Program {
    public static void main(String[] args)
    {
        int[] arr = new int[]{1, -2, 99, 4, 52, -3, 10, 100};
        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(arr));
        System.out.println("Преобразованный массив:");
        System.out.println(Arrays.toString(transformArray(arr)));
    }

    public static int[] transformArray(int[] arr)
    {
        int sumOfIndexes = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] >= 10 && arr[i] <= 99)
                sumOfIndexes += i;
        }
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] < 0)
                arr[i] = sumOfIndexes;
        }
        return arr;
    }
}
