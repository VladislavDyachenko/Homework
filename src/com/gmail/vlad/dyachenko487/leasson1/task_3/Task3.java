package com.gmail.vlad.dyachenko487.leasson1.task_3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Задача №3");

        System.out.print("Введите радиус: ");

        double radius = sc.nextDouble();


        double circumference = Math.PI * 2 * radius;
        System.out.println("Длина окружности равна: " + circumference);

        sc.close();
    }
}
