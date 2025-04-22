package CoreJava.Section01_Introduction;

import java.lang.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class WelcomeMessage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("May I know your name? ");
        String name = sc.next(); // it will take single world
        //String name = sc.nextLine(); // it will take multiple world

        System.out.println("Welcome " + name + " to the world of java programming.");

        sc.useRadix(2);
        System.out.println("Enter binary value as input : ");
        int binaryNumber = sc.nextInt();
        System.out.println("Binary to decimal : " + binaryNumber);

        int a = sc.nextInt();
        System.out.println(" num is : " + a);
    }
}
