class Solution {
    public int countGoodRotations(int[] nums) {
        int n = nums.length;
        int half = n / 2;
        int total_sum = 0;
        int count = 0;
        int leftHalf_sum = 0;

        for(int num : nums){
            total_sum += num;
        }
        for(int i = 0; i < half; i++){
            leftHalf_sum += nums[i];
        }

        for(int i = 0; i < n; i++){
            int rightHalf_sum = total_sum - leftHalf_sum;
            if(leftHalf_sum > rightHalf_sum){
                count++;
            }
            leftHalf_sum = leftHalf_sum - nums[i] + nums[(i+half) % n];
        }
        return count;
    }
}