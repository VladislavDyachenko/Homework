package com.gmail.vlad.dyachenko487.leasson3.task_4;
/*Вычислить с помощью цикла факториал числа - n введенного с
        клавиатуры (4<n<16). Факториал числа это произведение всех чисел от
        этого числа до 1. Например 5!=5*4*3*2*1=120*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f = 1;
        int n;
        System.out.println("input n ( 4 < n < 16) + Press Enter ");
        n = sc.nextInt();

        if (n > 4 && n < 16) {
            for (int i = 1; i <= n; i++) {
                f = f * i;

            }
            System.out.println("factorial = " + f );
        } else {
            System.out.println("error");
        }
        sc.close();
    }
}
