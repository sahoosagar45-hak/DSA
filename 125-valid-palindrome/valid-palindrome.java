class Solution {
    public boolean isPalindrome(String s) {
         s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        int n = s.length();
        int st = 0;
        int end = n - 1;
        while (st < end){
            if((int)s.charAt(st) != (int)s.charAt(end)){
                return false;
            }
            st++;
            end--;
        }
        return true;
    }
}