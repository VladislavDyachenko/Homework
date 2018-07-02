package com.gmail.vlad.dyachenko487.leasson2.task_4;

/* Треугольник существует только тогда, когда сумма любых двух его
сторон больше третьей. Дано: a, b, c – стороны предполагаемого
треугольника. Напишите программу которая укажет существует такой
треугольник или нет.*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("input a");
        double a = sc.nextDouble();
        System.out.println("input b");
        double b = sc.nextDouble();
        System.out.println("input c");
        double c = sc.nextDouble();

        if (a + b > c && a + c > b && c + b > a) {
            System.out.println("exist");
        } else {
            System.out.println("does not exist");
        }
        sc.close();

    }
}
