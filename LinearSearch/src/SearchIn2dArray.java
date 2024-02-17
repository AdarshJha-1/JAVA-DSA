import java.util.Arrays;

public class SearchIn2dArray {
    public static void main(String[] args) {
        int[][] arr = {
                {21, 343, 4},
                {91, -33, 47, -1, 89},
                {1, 2, 26, 43},
        };
        int min = minEle(arr);
        System.out.println(min + " is the minimum element in this 2D array");

        int max = maxEle(arr);
        System.out.println(max + " is the maximum element in this 2D array");

        int key = 43;
        int[] presentAt = search(arr, key);
        if(presentAt[0] == -1 || presentAt[1] == -1){
            System.out.println(key + " is not present in this 2d Array");
        } else {
            System.out.println(key + " is the present at index " + Arrays.toString(presentAt) + " in this 2d Array");
        }
    }

    static int minEle(int[][] arr){
        int min = Integer.MAX_VALUE;
        for (int i=0; i<arr.length; i++){
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] < min){
                    min = arr[i][j];
                }
            }
        }
        return min;
    }

    static int maxEle(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++){
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

    static int[] search(int[][] arr, int key){
        for (int i=0; i<arr.length; i++){
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == key) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
