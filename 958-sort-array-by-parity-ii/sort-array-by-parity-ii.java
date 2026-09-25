class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int st = 0;
        int end = 1;
        while (st < n && end < n){
            if (nums[st] % 2 != 0 && nums[end] % 2 == 0) {
                int temp = nums[st];
                nums[st] = nums[end];
                nums[end] = temp;
            }
            if (nums[st] % 2 == 0) {
                st += 2;
            }
            if (nums[end] % 2 != 0) {
                end += 2;
            }
        }
        return nums;
    }
}