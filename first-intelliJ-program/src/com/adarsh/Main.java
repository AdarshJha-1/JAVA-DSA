package com.adarsh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello and welcome!");
//        System.out.println("Hello and welcome!");
//        System.out.println(4543);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name;
//        name = input.next();
        name = input.nextLine();
        System.out.print("Enter you age: ");
        int age;
        age = input.nextInt();
        System.out.println("Hello "+name+" and your age is "+ age);

    }
}