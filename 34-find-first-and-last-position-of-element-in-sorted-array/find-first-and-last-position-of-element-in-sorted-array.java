class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = leftSearch(nums,target);
        ans[1] = rightSearch(nums, target);
        return ans;
    }

    public static int leftSearch(int[] nums, int target){
        int ans1 = -1;
        int st = 0;
        int end = nums.length - 1;
        while (st <= end){
            int mid = st + (end - st) / 2;
            if(nums[mid] == target){
                ans1 = mid;
                end = mid - 1;
            } else if (nums[mid] < target) {
                st = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return ans1;
    }
    public static int rightSearch(int[] nums, int target){
        int ans2 = -1;
        int st = 0;
        int end = nums.length - 1;
        while (st <= end){
            int mid = st + (end - st) / 2;
            if(nums[mid] == target){
                ans2 = mid;
                st = mid + 1;
            } else if (nums[mid] < target) {
                st = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return ans2;
    }
}