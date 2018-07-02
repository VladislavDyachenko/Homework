package com.gmail.vlad.dyachenko487.leasson2.task_1;

/*Написать программу которая считает 4 числа c клавиатуры и выведет на
экран самое большое из них.*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int a;
        System.out.println("enter number one ");
        a = sc.nextInt();

        int b;
        System.out.println("enter number two ");
        b = sc.nextInt();

        int c;
        System.out.println("enter number three ");
        c = sc.nextInt();

        int d;
        System.out.println("enter number four ");
        d = sc.nextInt();

        int max;
        max = a;

  /*      if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        if (d > max) {
            max = d;
        }

        System.out.println("Max = " + max);

*/
     max = b > max ?  b : max;
     max = c > max ?  c : max;
     max = d > max ?  d : max;


        System.out.println("\nMax: " + max );

        sc.close();
    }
}


