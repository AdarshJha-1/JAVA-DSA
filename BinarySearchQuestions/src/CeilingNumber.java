public class CeilingNumber {
    public static void main(String[] args) {
        int[] arr = {-11, -9, -5, -2, -1, 3, 14, 28, 32, 52, 75};
        int target = -3;
        int ceiling = findCeiling1(arr, target);
        System.out.println(ceiling);
    }

    static int findCeiling(int[] arr, int target){
        int ceiling = -1;
        int s = 0;
        int e = arr.length - 1;
        while (s <= e){
            int mid = s + (e - s)/2;
            if(target == arr[mid]){
                return arr[mid];
            } else if (target < arr[mid]) {
                ceiling = arr[mid];
                e = mid - 1;
            }else {
                s = mid + 1;
            }
        }
        return ceiling;
    }

    static int findCeiling1(int[] arr, int target){
        int s = 0;
        int e = arr.length - 1;
        while (s <= e){
            int mid = s + (e - s)/2;
            if(target == arr[mid]){
                return arr[mid];
            } else if (target < arr[mid]) {
                e = mid - 1;
            }else {
                s = mid + 1;
            }
        }
        return (s < arr.length ? arr[s] : -1);
    }
}