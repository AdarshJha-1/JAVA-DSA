import java.util.Arrays;

public class ArrayWithFunction {
    public static void main(String[] args) {
        int[] num = {12, 34 , 5, 6, 56, 55};
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));
    }

    static void change(int[] arr){
        arr[3] = 99;
    }       // arrays are mutable in JAVA
}
