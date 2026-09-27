class Solution {
    public int[] rearrangeArray(int[] nums) {
         int[] freq = new int[101];
        for(int num : nums){
            freq[num]++;
        }
        int n = nums.length;
        int[] ans = new int[n];
        int point = 0;
        while(point < n){
            for(int i = 1; i <= 100; i++){
                if(freq[i] > 0){
                    ans[point++] = i;
                    freq[i]--;
                }
            }
        }
        return ans;
    }
}