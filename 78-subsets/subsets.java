class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int index = 0;
        solve(nums,index,output,ans);
        return ans;
    }
    static void solve(int[] nums, int index, List<Integer> output, List<List<Integer>> ans){
        if(index >= nums.length){
            ans.add(new ArrayList<>(output));
            return;
        }
        int current = nums[index];
        output.add(current);
        solve(nums, index + 1, output, ans);
        output.remove(output.size() - 1);  // BackTracking
        solve(nums, index + 1, output, ans);
    }
}