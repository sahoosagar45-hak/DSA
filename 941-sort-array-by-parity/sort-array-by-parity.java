class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        if(n == 1){
            return nums;
        }
        int st = 0;
         int end = n - 1;
         while (st < end){
             if(nums[st] % 2 != 0 && nums[end] % 2 == 0){
                 int temp = nums[st];
                 nums[st] = nums[end];
                 nums[end] = temp;
             }
             if(nums[st] % 2 == 0){
                 st++;
             }
             if(nums[end] % 2 != 0){
                 end--;
             }
         }
        return nums;
    }
}