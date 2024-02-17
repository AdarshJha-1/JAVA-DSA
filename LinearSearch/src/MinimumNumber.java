public class MinimumNumber {
    public static void main(String[] args) {
        int[] arr = {12, 4, -45, 65, 33, 1};
        int minimumNumber = minNum(arr);
        System.out.println(minimumNumber + " is the minimum in this array");
    }

    static int minNum(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int v : arr){
            if(v < min){
                min = v;
            }
        }
        return min;
    }
}
