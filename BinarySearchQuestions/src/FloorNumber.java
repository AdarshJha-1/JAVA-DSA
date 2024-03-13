public class FloorNumber {
    public static void main(String[] args) {
        int[] arr = {-11, -9, -5, -2, -1, 3, 14, 28, 32, 52, 75};
        int target = -4;
        int floor = floorOfNumber(arr, target);
        System.out.println(floor);
    }

    static int floorOfNumber(int[] arr, int target){
        int l = 0;
        int h = arr.length - 1;
        while(l<=h){
            int mid = l + (h-l)/2;
            if(arr[mid] == target) return arr[mid];
            else if (arr[mid] < target) {
                l = mid + 1;
            }
            else {
                h = mid - 1;
            }
        }
        return h>=0 ? arr[h] : -1 ;
    }
}
