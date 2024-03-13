import java.util.Arrays;
import java.lang.System;
public class Main {
    public static void main(String[] args) {
        int[] arr = {12, -43, 2, 4, -24, -5};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr){
        for(int i = 0; i<arr.length; i++){
            int swapHappen = 0;
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j] < arr[j-1]){
                    swapHappen = 1;
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
            if(swapHappen == 0){
                break;
            }
        }
    }
}