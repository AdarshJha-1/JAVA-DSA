import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args){
        // create an array
        int[] arr = {1, 4, 4, 55, 6, 65, 6};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums){
        nums[0] = 1111;
    }
}

