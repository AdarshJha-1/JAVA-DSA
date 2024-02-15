import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        int reverseNum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        while (num != 0) {
            int n;
            n = num % 10;
            reverseNum = (reverseNum * 10) + n;
            num /= 10;
        }
        System.out.println(reverseNum);
    }
}
