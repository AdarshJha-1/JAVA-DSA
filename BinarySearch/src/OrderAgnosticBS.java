public class OrderAgnosticBS {
    public static void main(String[] args) {

        int[] array = {-344, -12, -1, 0, 2, 8, 14, 15, 44, 344, 545};
        int key  = 44;
//        int[] array =  {101, 81, 62, 14, 2, -11, -122};
//        int key  = -11;
        int foundAt;
        if(array[0] < array[array.length - 1]){
            foundAt = binarySearchAscending(array, key);
            if(foundAt != -1){
                System.out.println(key + " present at index " + foundAt + " in this Ascending Array");
            }else {
                System.out.println(key + " is not present");
            }
        }else {
            foundAt = binarySearchDescending(array, key);
            if(foundAt != -1){
                System.out.println(key + " present at index " + foundAt + " in this Descending Array");
            }else {
                System.out.println(key + " is not present");
            }
        }

    }

    static int binarySearchAscending(int[] arr, int key){
        if(arr.length == 0) return -1;
        int s = 0, e = arr.length - 1;
        while(s <= e){
//            int mid =  (s + e)/2; --> might exceed the MAX limit of an Integer
            int mid =  s + (e -s)/2;    // better and optimal way
            if(arr[mid] == key) return mid;    // found
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
            if(arr[mid] == key) return mid;    // found
            else if (key > arr[mid]) {
                e = mid - 1;  // go to right side
            }else {
                s = mid + 1; // go to left side
            }
        }
        return -1;
    }
}