package com.gmail.vlad.dyachenko487.leasson3.task_2;
/*Выведите на экран прямоугольник из *. Причем высота и ширина
прямоугольника вводятся с клавиатуры. Например ниже представлен
прямоугольник с высотой 4 и шириной 5.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Введите высоту:");
        int v = sc.nextInt();
        System.out.println("Введите ширину:");
        int h = sc.nextInt();

        for (int i = 0; i < v; i++) {

            for (int j = 0; j < h; j++) {
                if (i == 0 || i == v - 1) {
                    System.out.print("*");
                } else {
                    if (j == 0 || j == h - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }


            }
            System.out.println();
        }


    }
}
