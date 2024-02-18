public class BinarySearch {
    public static void main(String[] args) {

        int[] ascendingArray = {-344, -12, -1, 0, 2, 8, 14, 15, 44, 344, 545};
        int[] descendingArray = {10, 8, 6, 4, 2};
//        int[] arr1 = {12};
//        int[] arr2 = {};
        int keyA = 8;
        int foundedAtA = binarySearchAscending(ascendingArray, keyA);
        if(foundedAtA != -1){
            System.out.println(keyA + " present at index " + foundedAtA + " in this Ascending Array");
        }else {
            System.out.println(keyA + " is not present");
        }

        int keyB = 2;
        int foundedAtD = binarySearchDescending(descendingArray, keyB);
        if(foundedAtD != -1){
            System.out.println(keyB + " present at index " + foundedAtD + " in this Descending Array");
        }else {
            System.out.println(keyB + " is not present");
        }
    }

    static int binarySearchAscending(int[] arr, int key){
        if(arr.length == 0) return -1;
        int s = 0, e = arr.length - 1;
        while(s <= e){
//            int mid =  (s + e)/2; --> might exceed the MAX limit of an Integer
            int mid =  s + (e -s)/2;    // better and optimal way
            if(arr[mid] == key) return mid;    // founded
            else if (key > arr[mid]) {
                s = mid + 1;   // go to right side
            }else {
                e = mid - 1;    // go to left side
            }
        }
        return -1;
    }

    static int binarySearchDescending(int[] arr, int key){
        if(arr.length == 0) return -1;
        int s = 0, e = arr.length - 1;
        while(s <= e){
//            int mid =  (s + e)/2; --> might exceed the MAX limit of an Integer
            int mid =  s + (e -s)/2;    // better and optimal way
            if(arr[mid] == key) return mid;    // founded
            else if (key > arr[mid]) {
                e = mid - 1;  // go to right side
            }else {
                s = mid + 1; // go to left side
            }
        }
        return -1;
    }
}