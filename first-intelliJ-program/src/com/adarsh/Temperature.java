package com.adarsh;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter temperature in C: ");
        float tempInC = input.nextInt();
        float tempInF = (tempInC * 9/5)+ 32;
        System.out.println("Temperature in F: "+ tempInF);
    }
}
