package com.gmail.vlad.dyachenko487.leasson2.task_3;

/*Определить количество дней в году, который вводит пользователь. В
високосном годе - 366 дней, тогда как в обычном 365. Високосный год
определяется по следующему правилу:
Год високосный, если он делится на четыре без остатка, но если он
делится на 100 без остатка, это не високосный год. Однако, если он
делится без остатка на 400, это високосный год.*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("enter the number of days in the year");
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            System.out.println(366);
        else
            System.out.println(365);

        sc.close();
    }
}
