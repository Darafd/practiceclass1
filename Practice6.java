package kz.practice.firstLesson;
import java.util.Scanner;

public class Practice6 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

/*
Задание 6
Напишите программу, которая выводит сумму, умножение и разницу трех чисел. Все числа мы вводим через консоль.

Ввод:   10 20 30

Вывод:  a + b + c = 60
        a – b – c = -40
        a * b * c = 6000

Ввод:   5 10 15

Вывод:  a + b + c = 30
        a – b – c = -20
        a * b * c = 750
 */
        // task #6
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(a+b+c);
        System.out.println(a-b-c);
        System.out.println(a*b*c);
/*
Задание 7
Напишите программу, в которой я ввожу 2 целостных числа a и b, поменяйте значения переменных местами.

Ввод:   2 10
Вывод:  a = 10
        b = 2

Ввод:   9 12
Вывод:  a = 12
        b = 9
*/
        System.out.println();
        // task #7
        a = sc.nextInt();
        b = sc.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

/*
Задание 8
Напишите программу, в которой я ввожу число, выведите в консоли квадрат и куб этого числа.

Ввод:   2
Вывод:  4
        8

Ввод:   3
Вывод:  9
        27
*/

        System.out.println();
        // task #8
        int number = sc.nextInt();
        System.out.println(number * number);
        System.out.println(number * number * number);

/*
Задание 9
Пользователь вводит три числа. Увеличьте первое число в два раза, второе число уменьшите на 3,
третье число возведите в квадрат и затем найдите сумму новых трех чисел.

Ввод:   2 4 6
Вывод:  41
Ввод:   3 6 9
Вывод:  90
*/
        System.out.println();
        // task #9
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        int summa = (a + a) + (b - 3) + (c * c);
        System.out.println(summa);
/*
Задание 10
Пользователь вводит значение температуры в градусах Цельсия. Вывести температуру в градусах Фаренгейта. T = (9/5 * t)+32

Ввод:   35
Вывод:  95
Ввод:   66
Вывод:  150.8
*/
        System.out.println();
        // task #10
        double tem = sc.nextDouble();
        double nine = 9;
        double five = 5;
        double T = (((nine/five) * tem) + 32);
        System.out.println(T);

    }
}
