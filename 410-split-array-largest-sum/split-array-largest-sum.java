class Solution {

    static boolean isValidans(int[] nums, int k, int mid){
        int currentSun = 0;
        int currentSubarray = 1;
        for(int num : nums){
            if(num + currentSun <= mid){
                currentSun += num;
            }
            else {
                currentSubarray++;
                if(currentSubarray > k){
                    return false;
                }
                else{
                    currentSun = num;
                }
            }
        }
        return true;
    }

    public int splitArray(int[] nums, int k) {
        int max = 0 ;
        int sum = 0;
        for(int num: nums){
            sum += num;
            max = Math.max(max,num);
        }
        int st = max;
        int end = sum;
        int ans = 0;
        while (st <= end){
            int mid = st + (end - st) / 2;
            if(isValidans(nums,k,mid)){
                ans = mid;
                end = mid - 1;
            }
            else{
                st = mid + 1;
            }
        }
        return ans;
    }
}