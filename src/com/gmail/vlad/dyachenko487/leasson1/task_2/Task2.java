package com.gmail.vlad.dyachenko487.leasson1.task_2;


public class Task2 {

    public static void main(String[] args) {

        System.out.println("Задача Задача №2");

        double a = 2.4;
        double b = 3.4;
        double c = 5.1;
        double d = (a + b + c) / 2;
        double e = Math.sqrt(d * (d - a) * (d - b) * (d - c));
        System.out.println(e);

    }
}
