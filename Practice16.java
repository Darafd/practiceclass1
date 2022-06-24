package kz.practice.firstLesson;
import java.util.Scanner;

public class Practice16 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

/*
Задание 16
Напишите программу в которой я ввожу три целостных чисел a, b и c,
и если сумма a и b больше c, то программа выведет true, иначе false.

    Ввод:   4 5 6
    Вывод: true

    Ввод:   4 5 20
    Вывод:  false
*/
        // task #16
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>c && b>c) System.out.println(true);
        else System.out.println(false);

/*
Задание 17
Напишите программу в которой я ввожу три целостных чисел a, b, c.
Если число b находится между числами a и c, то программа выведет true,
иначе false.

    Ввод:   4 5 6
    Вывод:  true

    Ввод:   4 9 6
    Вывод:  false
*/
        // task #17
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if(a<b && b<c || a>b && b>c) System.out.println(true);
        else System.out.println(false);
/*
Задание 18
Напишите программу в которой я ввожу расстояние L в сантиметрах.
Используя операцию деления нацело, найти количество полных метров
в нем (1 метр = 100 см).

    Ввод:   200
    Вывод:  2

    Ввод: 250
    Вывод: 2
*/
        // task #18
        System.out.println(a = sc.nextInt() / 100);

/*
Задание 19
Напишите программу в которой я ввожу размер файла в байтах.
Используя операцию деления нацело, найти количество полных килобайтов,
которые занимает данный файл(1 килобайт = 1024 байта).

    Ввод:   2048
    Вывод:  2

    Ввод:   3056
    Вывод:  2
*/
        //task #19
        System.out.println(a = sc.nextInt() / 1024);

/*
Задание 20
Напишите программу в которой я ввожу трехзначное число.
Найти сумму и его цифр.

    Ввод:   351
    Вывод:  9

    Ввод:   652
    Вывод:  13
*/
        // task #20
        a = sc.nextInt();

        int h = a / 100;
        int d = (a / 10) % 10;
        int u = a % 10;
        int f = h + d + u;

        System.out.println(f);
    }
}
