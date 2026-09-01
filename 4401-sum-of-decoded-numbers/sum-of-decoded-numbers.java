class Solution {
    static final long MOD = 1000000007;
    public int sumDecoded(long[] nums) {
        int n = nums.length;
        long ans = 0;
        for(int i = 0; i < n; i++){
            int w = (int)(nums[i] % 10);
            long d =  nums[i] / 10;
            String str = String.valueOf(d);
            int x = Integer.parseInt(str.substring(0, w));
            int y = Integer.parseInt(str.substring(w));

            long value = power(x, y);
            ans = (ans + value) % MOD;
        }
        return (int)ans;
    }
    public long power(long x, long y) {

        long result = 1;

        while (y > 0) {

            if (y % 2 == 1) {
                result = (result * x) % MOD;
            }

            x = (x * x) % MOD;
            y = y / 2;
        }

        return result;
    }
}