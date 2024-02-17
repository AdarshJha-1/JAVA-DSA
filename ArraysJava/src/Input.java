import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // array of primitives
//        int[] arr = new int[5];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));
//        for(int i : arr){
//            System.out.print(i + " ");
//        }

        // array of objects
        String[] names = new String[4];
        for (int i = 0; i < names.length; i++) {
            names[i] = sc.next();
        }

        for(String name : names){
            System.out.print(name + " ");
        }
    }
}
