// 1) Дана последовательность N целых чисел. Найти сумму простых чисел.

package org.example.hw230417.task1;

import java.util.Scanner;
import static java.lang.Math.sqrt;

public class Program {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println(getSumSimple(scanner));
        scanner.close();
    }

    /**
     *
     * @param num целое число
     * @return true если число простое, false если нет
     */
    public static boolean isSimple(int num)
    {
        if (num < 2)
            return false;
        double sq = sqrt(num);
        for (int i = 2; i <= sq; i++)
        {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    /**
     *
     * @param scanner первое число - длина последовательности, последующие - числа последовательности
     * @return сумма простых чисел в последовательности
     */
    public static int getSumSimple(Scanner scanner)
    {
        int sum = 0;
        System.out.println("Введите длину последовательности:");
        int n = scanner.nextInt();
        System.out.println("Введите последовательность чисел:");
        while (n > 0)
        {
            int a = scanner.nextInt();
            if (isSimple(a))
                sum += a;
            n--;
        }
        System.out.printf("Сумма простых чисел: ");
        return sum;
    }

}
