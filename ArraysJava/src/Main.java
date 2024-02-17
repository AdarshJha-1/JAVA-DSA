import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // Q: Store a roll no.
        int a = 19;
        // Q: Store a name.
//        String name = "Adarsh Jha";

        // Store 5 roll no.
        int r1 = 111;
        int r2 = 121;
        int r3 = 143;
        int r4 = 141;
        int r5 = 101;

        // syntax
        // datatype[] variable_name = new datatype[size];

        // store 5 roll no.
        int[] rollNumbers1;     // array declaration
        rollNumbers1 = new int[5];    // array initialisation
        // or
        int[] rollNumbers2 = {11, 22, 33, 44, 55};
//        int[] ros = {};
        System.out.println(Arrays.toString(rollNumbers1));
        System.out.println(rollNumbers2[4]);

        String[] names = {"Adarsh Jha", "Aditya Jha", "Kunal", "Elon musk"};
        System.out.println(Arrays.toString(names));
        for(String name : names){
            System.out.print(name + " ");
        }

    }


}