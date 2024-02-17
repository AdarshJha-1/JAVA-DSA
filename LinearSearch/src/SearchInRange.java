public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {12, 43, 54, 34, -5, 342};
        int sIndex = 1;
        int eIndex = 4;
        int key = -5;
        System.out.println(searchInRangeSE(arr, sIndex, eIndex, key));
        System.out.println(key + " present at " + searchInRange(arr, sIndex, eIndex, key));
    }


    static boolean searchInRangeSE(int[] arr, int s, int e, int key) {
        if (arr.length == 0 || s == -1 || e == -1) return false;
        for (int i = s; i <= e; i++) {
            if (arr[i] == key) return true;
        }
        return false;
    }

    static int searchInRange(int[] arr, int s, int e, int key) {
        if (arr.length == 0 || s == -1 || e == -1) return -1;
        for (int i = s; i <= e; i++) {
            if (arr[i] == key) return i;
        }
        return -1;
    }

}
