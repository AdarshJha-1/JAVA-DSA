import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Q: Take an input of 2 numbers and print the sum
        int num1, num2, sum;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        num1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        num2 = sc.nextInt();
        sum = num1 + num2;
        System.out.println("The Sum = "+ sum);
    }
 }