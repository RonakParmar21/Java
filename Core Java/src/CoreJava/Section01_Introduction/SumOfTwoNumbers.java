package CoreJava.Section01_Introduction;

import java.util.Scanner;
import java.lang.*;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int num1 = sc.nextInt();

        System.out.println("Enter second number : ");
        int num2 = sc.nextInt();

        int sumOfNum1AndNum2 = num1 + num2;

        System.out.println("Sum of Num1 and Num2 is : " + sumOfNum1AndNum2);
    }
}
