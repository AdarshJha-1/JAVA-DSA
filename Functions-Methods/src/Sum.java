import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//        sum1();
//        int sum = sum2();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = sc.nextInt();
        int sum = sum3(num1, num2);
        System.out.println("The Sum: "+ sum);
    }

//    static void sum1(){      // no return value
//        System.out.println("-- inside 1 --");
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter number 1: ");
//        int num1 = sc.nextInt();
//        System.out.print("Enter number 2: ");
//        int num2 = sc.nextInt();
//        int sum = num1 + num2;
//        System.out.println("The Sum: "+ sum);
//    }
//
//    static int sum2(){ // with return value
//        System.out.println("-- inside 2 --");
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter number 1: ");
//        int num1 = sc.nextInt();
//        System.out.print("Enter number 2: ");
//        int num2 = sc.nextInt();
//        return num1 + num2;
//
//    }

    static int sum3(int num1, int num2){ // with return value and argument
        System.out.println("-- inside 3 --");
        return num1 + num2;
    }

}
