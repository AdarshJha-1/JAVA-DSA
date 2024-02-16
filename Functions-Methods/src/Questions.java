import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // check the number is prime or not
        boolean isPrime = isPrimeOrNot(n);
        if (isPrime){
            System.out.println(n + " is Prime number");
        } else{
            System.out.println(n + " is not a Prime number");
        }

    // all three digits armstrong number
        armstrongNumber();

    }

    // check the number is prime or not
    static boolean isPrimeOrNot(int n){
        if(n <= 1) return false;
        for (int i=2; i<=Math.sqrt(n); i++){
            if(n%i == 0) return false;
        }
        return true;
    }

    // all three digits armstrong number
    static void armstrongNumber(){
        int arm;
        for(int i=100; i<=999; i++){
            int temp = i;
            int sum = 0;
            while(temp != 0){
                sum += ((temp%10)*(temp%10)*(temp%10));
                temp /= 10;
            }
            if(sum == i){
                System.out.println(i);
            }
        }
    }

}
