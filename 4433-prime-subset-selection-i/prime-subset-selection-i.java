class Solution {
    public List<Integer> maxPrimes(int n, int s) {
        List<Integer> ans = new ArrayList<>();

        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);

        if (n >= 0) isPrime[0] = false;
        if (n >= 1) isPrime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        
        long sum = 0;

        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                if (sum + i <= s) {
                    ans.add(i);
                    sum += i;
                }
            }
        }

        return ans;
    }
}