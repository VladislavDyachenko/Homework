package com.gmail.vlad.dyachenko487;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("введите любое 5-и значное число + Press Enter");
        int number = sc.nextInt();

        System.out.println(number / 10000);
        System.out.println(number % 10000 / 1000);
        System.out.println(number % 1000 / 100);
        System.out.println(number % 100 / 10);
        System.out.println(number % 10);
        sc.close();

    }
}
