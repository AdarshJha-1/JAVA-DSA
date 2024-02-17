import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);

        int[] arr = new int[10];
        System.out.println("Enter the value for an array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the value you want to search in an array??");
        int key = sc.nextInt();

        int presentAt = linearSearch(arr, key);
        if(presentAt == -1){
            System.out.println(key + " is not present in array!");
        } else {
            System.out.println(key + " is present in array at index " + presentAt);
        }
    }

    static int linearSearch(int[] arr, int key){
        if(arr.length == 0) return -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key) return i;
        }
        return -1;
    }
}