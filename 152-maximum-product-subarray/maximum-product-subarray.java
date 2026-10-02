class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int leftP = 1;
        int rightP = 1;
        int ans = nums[0];
        for(int i = 0 ; i < n; i++){
            leftP = leftP == 0? 1 : leftP;
            rightP = rightP == 0 ? 1 : rightP;

            leftP *= nums[i];
            rightP *= nums[n - i -1];
            ans = Math.max(ans,Math.max(leftP, rightP));
        }
        return ans;
    }
}