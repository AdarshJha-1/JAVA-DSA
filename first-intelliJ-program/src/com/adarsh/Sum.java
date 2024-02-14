package com.adarsh;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of Number 1 & Number 2");
        System.out.print("Number 1: ");
        int num1 = input.nextInt();
//        float num11 = input.nextInt();
        System.out.print("Number 2: ");
        int num2 = input.nextInt();
//        float num22 = input.nextInt();

        int sum1 = num1 + num2;
//        float sum2 = num11 + num22;

        System.out.println("Sum 1 = "+ sum1);
//        System.out.println("Sum 2 = "+ sum2);
    }
}
