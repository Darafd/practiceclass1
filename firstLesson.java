package kz.bitlab;
import java.util.Scanner;


public class firstLesson {
    public static void main(String[] args){
        System.out.println("Hello Darafd");

        Scanner keyBoard = new Scanner(System.in);

        System.out.println("Insert variable byte b");
        byte b = keyBoard.nextByte();
        System.out.println("Insert variable short s");
        short s = keyBoard.nextShort();
        System.out.println("Insert variable int i");
        int i = keyBoard.nextInt();
        System.out.println("Insert variable long l");
        long l = keyBoard.nextLong();

        System.out.println("Insert variable float f");
        float f = keyBoard.nextFloat();
        System.out.println("Insert variable double d");
        double d = keyBoard.nextDouble();

        System.out.println("Insert variable boolean bool");
        boolean bool = keyBoard.nextBoolean();

        System.out.println("Output variable b " + b);
        System.out.println("Output variable s " + s);
        System.out.println("Output variable i " + i);
        System.out.println("Output variable l " + l);
        System.out.println();
        System.out.println("Output variable f " + f);
        System.out.println("Output variable d " + d);
        System.out.println();
        System.out.println("Output variable bool " + bool);


    }
}
