class Solution {
    public List<String> letterCombinations(String digits) {
        String p = "";
        ArrayList<String> ans = new ArrayList<>();
        if (digits.isEmpty()) {
            return ans;
        }
        solve(p,digits,ans);
        return ans;
    }

    private void solve(String p, String up,ArrayList<String> ans) {
        if (up.isEmpty()) {
            ans.add(p);
            return;
        }
        String[] map = {
                "abc",
                "def",
                "ghi",
                "jkl",
                "mno",
                "pqrs",
                "tuv",
                "wxyz"
        };
        int digit = up.charAt(0) - '2';
        String data = map[digit];
        for (int i = 0; i < data.length(); i++) {
            char ch = data.charAt(i);
            solve(p + ch, up.substring(1),ans);
        }
    }    
}