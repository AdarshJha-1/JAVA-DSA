package com.adarsh;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float number = input.nextInt(); // implicit typecasting
//        float number = input.nextDouble();
        System.out.println(number);

        int aa = (int)10.22f; // explicit typecasting
        System.out.println(aa);

        // automatic type promotion in expression
//        int a = 257;
//        byte b = (byte) a;  // 257 % 256 = 1

//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = (a * b) / c;
//
//        System.out.println(d);

        int num = 'a';
        System.out.println("你好");

        byte b = 43;
        char c = 'a';
        short s = 1024;
        int i = 34434;
        float f = 5.5f;
        double d = 0.234435;
        double result = (f * b) + (i / c) - (d * s);
        System.out.println((f * b) + " " + (i / c) + " " + (d * s));
        System.out.println(result);
    }


}

