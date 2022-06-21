package kz.practice.firstLesson;
import java.util.Scanner;

 /*
        Задание 1
        Напишите программу для вывода в консоли строки "Hello World!".
        Вывод:   Hello, World!

        Задание 2
        Напишите программу для вывода в консоли текущее название дня недели, название месяца и год.

        Вывод:  Saturday, December, 2020

        Задание 3
        Напишите программу, в которой я запрашиваю имя, и в конце программа выводит результат как в примере:

        Ввод:   Ilyas
        Вывод:  Hello Ilyas

        Ввод:  Aybek
        Вывод:  Hello Aybek

        Задание 4
        Напишите программу, в которой я запрашиваю имя, фамилию, возраст, страну,
        и в конце программа выводит данные пользователя в консоль.

        Ввод:   Ilyas Zhuanyshev 31 Kazakhstan

        Вывод:  Name: Ilyas
                Surname: Zhuanyshev
                Age: 31
                Country: Kazakhstan

        Ввод:   Aybek Bagit 28 Turkey

        Вывод:  Name: Aybek
                Surname: Bagit
                Age: 28
                Country: Turkey

        Задание 5
        Напишите программу в которой я запрашиваю университет, факультет, предмет, и в конце программа выводит
        данные пользователя в консоль.

        Ввод: BITLAB Computer Java

        Вывод: University: BITLAB
               Faculty: Computer
               Subject: Java

        Ввод: MIT Engineering Physics

        Вывод: University: MIT
               Faculty: Engineering
               Subject: Physics */

public class Practice1 {
    public static void main(String[] args){
        System.out.println("task #1");
        // task #1
        System.out.println("Hello world!");

        System.out.println();
        System.out.println("task #2");
        // task #2
        String nameWeek = "Saturday";
        String nameMonth = "December";
        int year = 2020;
        char comma = '\u002C';
        System.out.println(nameWeek + comma + "" + nameMonth + comma + " " + year);

        System.out.println();
        System.out.println("task #3");
        // task #3
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello " + name);

        System.out.println();
        System.out.println("task #4");
        // task #4
        name = sc.next();
        String surname = sc.next();
        byte age = sc.nextByte();
        String country = sc.next();
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Age: " + age);
        System.out.println("Country: " + country);

        System.out.println();
        System.out.println("task #5");
        // task #5
        String university = sc.next();
        String faculty = sc.next();
        String subject = sc.next();
        System.out.println("University: " + university);
        System.out.println("Faculty: " + faculty);
        System.out.println("Subject: " + subject);


    }
}
