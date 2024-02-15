import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
            for loop syntax
            for( initialisation, condition, increment/decrement) {
                 // body --> code to run
            }
        */

        // Q. print number from 1 to n;
//        System.out.print("Enter the value of N: ");
//        int N = input.nextInt();
//        for (int i = 1; i<=N; i++){
//            System.out.println(i+". Hello World");
//        }

          /*
            while loop syntax
            while( condition ) {
                 // body --> code to run
            }
        */

        // Q. print number from 1 to n;
        System.out.print("Enter the value of N: ");
        int n = input.nextInt();
        int i = 1;
        while(i<=n){
            System.out.println(i+". Hello World");
            i++;
        }

         /*
            do while loop syntax
            do{
                -- first run the code then check the condition --
                body --> code to run || will run the code inside do statement at lest one time
            } while( condition );
        */

        // Q. print number from 1 to n;
        System.out.print("Enter the value of N: ");
        int num = input.nextInt();
        int I = 1;
        do {
            System.out.println(I + ". Hello World");
            I++;
        } while(I<=n);
    }
}
