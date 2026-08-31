class Solution {
    public int countSpecialIntegers(int[] nums) {
        boolean[] seen = new boolean[101];
        boolean[] special = new boolean[101];

        for (int i = 0; i < nums.length; i++) {

            if (!seen[nums[i]]) {
                seen[nums[i]] = true;
                special[nums[i]] = true;
            } 
            else if (i > 0 && nums[i] != nums[i - 1]) {
                special[nums[i]] = false;
            }
        }

        int count = 0;

        for (int i = 1; i <= 100; i++) {
            if (special[i]) {
                count++;
            }
        }

        return count;
    }
}