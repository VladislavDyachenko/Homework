package com.gmail.vlad.dyachenko487.leasson3.task_1;

/*С помощью циклов нарисовать «обои». Причем количество полос
должно вводиться с клавиатуры. В примере 7 полос.
***+++***+++***+++***
***+++***+++***+++***
***+++***+++***+++***
***+++***+++***+++***
***+++***+++***+++****/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of pages: + press Enter");
        int x = sc.nextInt();

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= x; j++) {
                if (j % 2 != 0) {
                    System.out.print("***");
                } else {
                    System.out.print("+++");
                }

            }
            System.out.println();
            sc.close();

        }

    }

}