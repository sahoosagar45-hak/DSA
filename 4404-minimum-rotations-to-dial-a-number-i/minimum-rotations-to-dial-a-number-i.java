class Solution {
    public int minRotations(String s) {
        int current = 0;
        int minRotation = 0;
        for(int i = 0; i < s.length(); i++){
            int nextDigit = s.charAt(i) - '0';
            int distance = Math.abs(current - nextDigit);
            int rotaion = Math.min(distance, (10 - distance));
            minRotation += rotaion;
            current = nextDigit;
        }
        return minRotation;
    }
}