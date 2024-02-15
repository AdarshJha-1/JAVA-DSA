import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;
        int nthFibo = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("how many numbers of fibonacci you want??");
        int n = sc.nextInt();
        System.out.println(first);
        System.out.println(second);
        for (int i = 2; i<=n; i++){
            System.out.println(first + second);
            nthFibo = first + second;
            first = second;
            second  = nthFibo;
//            nthFibo = temp;
        }
        System.out.println(n + " Fibonacci number is " + nthFibo);
    }
}
