class Solution {
    static void solve(int[] candidates, int target, int index, List<Integer> output, List<List<Integer>> ans){
        if(target == 0){
            ans.add(new ArrayList<>(output));
            return;
        }
        if(target < 0){
            return;
        }
        if(index >= candidates.length){
            return;
        }

        output.add(candidates[index]);
        solve(candidates, target - candidates[index], index, output, ans);
        output.remove(output.size() - 1); // backtracking
        solve(candidates, target, index + 1, output, ans);

    }
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int index = 0;
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        solve(candidates, target, index, output, ans);
        return ans;
    }
}