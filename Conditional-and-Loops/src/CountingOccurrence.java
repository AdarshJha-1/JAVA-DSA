import java.util.Scanner;

public class CountingOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        System.out.println("Enter a number you want to check??");
        int key = sc.nextInt();
        int count = 0;
        if(num == 0){
            if (num == key) count += 1;
            System.out.println("Number "+ key + " occurred " + count + " times ");
        } else {
            while (num != 0) {
                int n;
                n = num % 10;
                if (n == key) count += 1;
                num /= 10;
            }
            System.out.println("Number " + key + " occurred " + count + " times ");
        }
    }
}