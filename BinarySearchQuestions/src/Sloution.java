class Solution {
    public int[] searchRange(   int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int s = -1, e = -1;
        while(low <= high){
            int mid = low + (high = low)/2;
            if(nums[mid] < target){
                low = mid + 1;
            } else if(nums[mid] > target){
                high = mid - 1;
            }else{
                if(s == -1 && e == -1){
                    s = mid;
                    e = mid;
                }else{
                    e = mid;
                }
            }
        }
        return new int[] {s, e};
    }
}