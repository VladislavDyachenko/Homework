package com.gmail.vlad.dyachenko487.leasson3.task_3;
/*Напечатайте таблицу умножения на 5. предпочтительно печатать 1 x 5 =
5, 2 x 5 = 10, а не просто 5, 10 и т. д.*/

public class Main {
    public static void main(String[] args) {

        int h = 5;

        for (int i = 1; i <= 10; i++) {

            System.out.println(i + " * " + h + " = " + h * i);
        }


    }
}
