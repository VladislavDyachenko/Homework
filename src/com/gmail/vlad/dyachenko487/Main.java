package com.gmail.vlad.dyachenko487;

import java.util.Scanner;

public class Main {

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





        System.out.println("Задача Задача №2");

        double a = 2.4;
        double b = 3.4;
        double c = 5.1;
        double d = (a + b + c) / 2;
        double e = Math.sqrt(d * (d - a) * (d - b) * (d - c));
        System.out.println(e);





        System.out.println("Задача №3");

        System.out.print("Введите радиус: ");

        double radius = sc.nextDouble();


        double circumference = Math.PI * 2 * radius;
        System.out.println("Длины окружности равна: " + circumference);

        sc.close();
    }
}
