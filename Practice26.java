package kz.practice.firstLesson;
import java.util.Scanner;

public class Practice26 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
/*
Задание 26
Напишите программу в которой я ввожу целое число x.
Найти значение y = 4(x−3) − 7(x−3) + 2 при данном значении x.

    Ввод:   4
    Вывод:  -1

    Ввод:   -4
    Вывод:  23
*/
        // task #26
        int x = in.nextInt();
        int y = 4 * (x - 3) - 7 * (x - 3) + 2;
        System.out.println(y);

/*
Задание 27
Напишите программу в которой я ввожу длины ребер a, b, c прямоугольного параллелепипеда.
Найти его объем V = a·b·c и площадь поверхности S = 2·(a·b + b·c + a·c).

    Ввод:   2 3 4
    Вывод:  V=24
            S=52

    Ввод:   10 20 5
    Вывод:  V=1000
            S=700
*/
        // task #27
        System.out.println();
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int v = a * b * c;
        int s = 2 * (a * b + b * c + a * c);
        System.out.println(v);
        System.out.println(s);

/*
Задание 28
Напишите программу в которой я ввожу число a.
Если число а является четным, то программа выведет true, иначе false.

    Ввод:   2
    Вывод:  True

    Ввод:   7
    Вывод:  false

*/
        // task #28
        System.out.println();
        if(a < 0 || a == 0)  System.out.println("Bul taq jane jup san emes");
        else if (a % 2 == 0) System.out.println(true);
        else System.out.println(false);

/*
Задание 29
Напишите программу в которой я ввожу целые числа a, b, c.
Если  существует треугольник со сторонами a, b, c, то программа выведет true, иначе false.

    Ввод:   6 7 8
    Вывод:  true

    Ввод:   2 3 6
    Вывод:  false
*/
        // task #29
        System.out.println();
        boolean boo = false;
        if(a + b > c) {
            if(a + c > b) {
                if(c + b > a) {
                    System.out.println("true");
                }else System.out.println("false");
            } else System.out.println("false");
        } else System.out.println("false");


/*
Задание 30
Дано трехзначное число.
Вывести вначале его последнюю цифру (единицы), а затем - его среднюю цифру (десятки).

    Ввод:   351
    Вывод:  1
            5

    Ввод:   236
    Вывод:  6
            3
*/
        //task #30
        System.out.println();
        System.out.println(a % 10);
        System.out.println(a / 10 % 10);

    }
}
