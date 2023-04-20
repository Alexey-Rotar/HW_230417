// 2) Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.

package org.example.hw230417.task2;

import java.util.Scanner;

public class Program {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        if (isIncrease(scanner))
            System.out.println("Последовательность возрастающая.");
        else
            System.out.println("Последовательность не возрастающая.");
        scanner.close();
    }

    /**
     *
     * @param scanner первое число - длина последовательности, последующие - числа последовательности
     * @return результат проверки, является ли последовательность возрастающей
     */
    public static boolean isIncrease(Scanner scanner){
        boolean flag = true;
        System.out.println("Введите длину последовательности:");
        int n = scanner.nextInt();
        System.out.println("Введите последовательность чисел:");
        int a = scanner.nextInt();
        while (n > 1)
        {
            int b = scanner.nextInt();
            if (a > b || a == b)
                flag = false;
            n--;
            a = b;
        }
        return flag;
    }

}
