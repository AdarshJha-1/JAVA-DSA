import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

                                // ex.
        int a = sc.nextInt();   // a = 10;
        int b = sc.nextInt();   // b = 12;
        int c = sc.nextInt();   // c = 11;
        int largest;
        // Q. find the largest of 3 numbers??

        int max = a;
        if (b > max){
            max = b;
        }
        if (c > max){
            max = c;
        }

        System.out.println(max);

        int maxNum = Math.max(Math.max(a,b), c);
        System.out.println(maxNum);
//        if(a>b && a>c){     // 10 > 12 && 10 > 11 --> false
//            largest = a;
//        } else if (b>a && b>c) { // 12 > 10 && 12 > 11 --> true
//            largest = b;        // largest = 12;
//        }else {     // last remaining condition --> c > a && c > b;
//            largest = c;
//        }
//        System.out.println(largest);


    }
}
