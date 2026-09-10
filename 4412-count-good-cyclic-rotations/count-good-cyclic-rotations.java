class Solution {
    public int countGoodRotations(int[] nums) {
        int n = nums.length;
        int half = n / 2;

        long total_sum = 0;
        long leftHalf_sum = 0;
        int count = 0;

        // Total sum
        for (int num : nums) {
            total_sum += num;
        }

        // Sum of first half
        for (int i = 0; i < half; i++) {
            leftHalf_sum += nums[i];
        }

        // Check every rotation
        for (int i = 0; i < n; i++) {

            long rightHalf_sum = total_sum - leftHalf_sum;

            if (leftHalf_sum > rightHalf_sum) {
                count++;
            }

            // Slide the window
            leftHalf_sum =
                leftHalf_sum - nums[i]
                + nums[(i + half) % n];
        }

        return count;
    }
}