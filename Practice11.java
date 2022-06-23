package kz.practice.firstLesson;
import java.util.Scanner;

public class Practice11 {
    public static void main(String[] arg){
/*
Задание 11
Пользователь вводит целые числа a, b и c. Измените значения этих переменных так,
чтобы в переменной а хранилась значение a+b,
В переменной b хранилась разность старых значений c-a, а в переменной
c хранилась сумма старых значений a+b+c. Выведите новые значения переменных.

    Ввод:   4 3 8
    Вывод:  a = 7
            b = 4
            c = 15

    Ввод:   9 10 11
    Вывод:  a = 19
            b = 2
            c = 30
*/
        Scanner sc = new Scanner(System.in);

        // task #11
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("a = " + (a + b));
        System.out.println("b = " + (c-a));
        System.out.println("c = " + (a + b + c));
/*
Задание 12
Выполните данную математическую операцию, где я ввожу a, b и c с консоли. Выполните данную операцию: a3 + 2b2 - 3ab + c3
*Подсказка: Вы можете использовать метод pow(). Пример: pow(3, 2) = 9.

    Ввод:   4 3 8
    Вывод:  558

    Ввод:   1 2 3
    Вывод:  30
*/
        System.out.println();
        // task #12
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
       // System.out.println((a*a*a)+2*(b*b)-3*(4*3)+(c*c*c));
        System.out.println(Math.pow(a, 3) + 2 * Math.pow(b, 2) - 3 * (a * b) + Math.pow(c, 3));

/*
Задание 13
Выполните данную математическую операцию где я ввожу x, y и z с консоли. Выполните данную операцию: x4 + 4xy2 - 4yz + z4.

    Ввод:   1 2 3
    Вывод:  74

    Ввод:   3 4 5
    Вывод:  818
*/
        System.out.println();
        // task #13
        int x = sc.nextInt();
        int y  = sc.nextInt();
        int z  = sc.nextInt();
        System.out.println(Math.pow(x,4) + 4 * x * Math.pow(y, 2) - 4 * y * z + Math.pow(z, 4));
/*
Задание 14
Выполните данную математическую операцию где я ввожу x, y и z с консоли. Выполните данную операцию: x3 + 5xy - 6zy + z3.

    Ввод:   1 2 3
    Вывод:  2

    Ввод:   3 4 5
    Вывод:  92
*/
        System.out.println();
        // task #14
        x = sc.nextInt();
        y  = sc.nextInt();
        z  = sc.nextInt();

        System.out.println(Math.pow(x,3) + 5 * x * y - 6 * z * y + Math.pow(z, 3));
/*
Задание 15
Напишите программу, в которой я ввожу два целостных числа, и если первое число больше второго,
то программа выведет true, иначе false.

    Ввод:   4 3
    Вывод:  true

    Ввод:   4 12
    Вывод:  false
*/
        System.out.println();
        // task #15
        a = sc.nextInt();
        b = sc.nextInt();
        if(a>b) System.out.println(true);
        else System.out.println(false);


    }
}
