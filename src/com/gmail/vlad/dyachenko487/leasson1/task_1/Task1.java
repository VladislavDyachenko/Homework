package com.gmail.vlad.dyachenko487.leasson1.task_1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Задача №1");
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
