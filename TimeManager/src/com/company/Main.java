package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = 0;
        int m = 0;
        while (true) {
            System.out.println("Enter h: ");
            boolean isInt = sc.hasNextInt();
            if (isInt) {
                int h1 = sc.nextInt();
                h += h1;
                System.out.println("Enter m: ");
                int m1 = sc.nextInt();
                m += m1;
                if (m > 60) {
                    h++;
                    m -= 60;
                }
                System.out.println("Current time: " + h + "h " + m + "m");
            } else {
                System.out.println("Exiting");
                break;
            } sc.nextLine();
        }
        System.out.println("Final time: " + h + "h " + m + "m");
    }
}
