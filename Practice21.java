package kz.practice.firstLesson;
import java.util.Scanner;

public class Practice21 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
/*
Задание 21
Напишите программу в которой я ввожу диаметр окружности d.
Найти ее длину L = π·d. В качестве значения π использовать 3.14.

    Ввод:   10
    Вывод:  31.4

    Ввод:   6
    Вывод:  18.84
*/
        //task #21

        final double PI = 3.14;
        int d = in.nextInt();
        double p = PI * d;
        System.out.println(p);

/*
Задание 22
Напишите программу в которой я ввожу радиус.
Найти длину окружности L и площадь круга S. L = 2·π·R, S = π·R2 .
В качестве значения π использовать 3.14.

    Ввод:   12
    Вывод:  L = 75.36
            S = 452.16

    Ввод:   5
    Вывод:  L = 31.4
            S = 78.5
*/
        // task #22
        System.out.println();
        double r = in.nextInt();
        double l = 2 * PI * r;
        double s = PI * Math.pow(r, 2);
        System.out.println(l);
        System.out.println(s);

/*
Задание 23
Напишите программу в которой я ввожу два неотрицательных числа a и b.
Найти их среднее геометрическое, то есть квадратный корень из их произведения: √a·b.

    Ввод:   36 25
    Вывод:  30

    Ввод:   25 144
    Вывод:  60
*/
        //task #23
        System.out.println();
        int a = in.nextInt();
        int b = in.nextInt();
        int jauab = (int) Math.sqrt(a * b);
        System.out.println(jauab);

/*
Задание 24
Напишите программу в которой я ввожу длину L окружности.
Найти ее радиус R и площадь S круга,  ограниченного этой окружностью,
учитывая, что L = 2·π·R, S = π·R2 . В качестве значения π использовать 3.14.

    Ввод:   14
    Вывод:  R = 2.23
            S = 15.6
    Ввод:   5
    Вывод:  R = 0.796
            S = 1.99
*/
        //task #24
        System.out.println();
        l = in.nextInt();
        r = (double) (l / (2 * PI));
        s = PI * Math.pow(r, 2);
        System.out.println(r);
        System.out.println(s);

/*
Задание 25
Напишите программу в которой я ввожу целое число x. Найти значение y = 3x2 − 6x − 7 при данном значении x.

Ввод:8
Вывод:137

Ввод:-4
Вывод:65
*/
        //task #25
        System.out.println();
        int x = in.nextInt();
        int  y = (int) (3 * Math.pow(x, 2) - 6 * x - 7);
        System.out.println(y);
    }
}
