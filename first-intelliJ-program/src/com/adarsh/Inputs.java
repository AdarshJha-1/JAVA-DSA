package com.adarsh;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter you roll no: ");
        int rollNo = input.nextInt();
        System.out.println("Your roll number is: " + rollNo);

        int a = 10;  // a --> identifier, 10 --> literals
//        int million1 = 30,000,000; // incorrect
        int million = 30_000_000; // correct

        System.out.print("Enter you name: ");
        String name = input.nextLine();
        System.out.println("Your name is: " + name);

        System.out.print("Enter you marks: ");
        float marks = input.nextFloat();
        System.out.println("Your marks is: " + marks);

        System.out.print("Enter you marks: ");
        double marks1 = input.nextDouble();
        System.out.println("Your marks is: " + marks1);

    }
}
