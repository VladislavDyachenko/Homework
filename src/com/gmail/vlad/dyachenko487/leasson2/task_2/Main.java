package com.gmail.vlad.dyachenko487.leasson2.task_2;

/*Есть девятиэтажный дом, в котором 4 подъезда. Номер подъезда
начинается с единицы. На одном этаже 4 квартиры. Напишите программу
которая получит номер квартиры с клавиатуры, и выведет на экран на
каком этаже, какого подъезда расположенна эта квартира. Если такой
квартиры нет в этом доме то нужно сообщить об этом пользователю.*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.println("Input flat number");
        Scanner sc = new Scanner(System.in);

        int flat = sc.nextInt();

        if (flat > 0 && flat < 145) {

            switch ((flat - 1) / 36) {
                case 0:
                    System.out.println("entrance 1");
                    System.out.println("floor " + ((flat - 1) % 36 / 4 + 1));
                    break;
                case 1:
                    System.out.println("entrance 2");
                    System.out.println("floor " + ((flat - 1) % 36 / 4 + 1));
                    break;
                case 2:
                    System.out.println("entrance 3");
                    System.out.println("floor " + ((flat - 1) % 36 / 4 + 1));
                    break;
                case 3:
                    System.out.println("entrance 4");
                    System.out.println("floor " + ((flat - 1) % 36 / 4 + 1));
                    break;
                default:
                    break;
            }

        } else {
            System.out.println("there is no such apartment");
            sc.close();
        }

    }

}