package kz.practice.firstLesson;

public class Draft {
    public static void main(String[] args) {
        int x = 987;
        int a = x / 100;
        int b = (x / 10) % 10;
        int c = x % 10;
        int f = a + b + c;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(f);

    }
}
