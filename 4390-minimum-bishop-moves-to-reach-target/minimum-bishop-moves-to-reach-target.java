class Solution {
    public int minBishopMoves(int[] source, int[] target) {
        int sl = source[0];
        int sr = source[1];
        int tl = target[0];
        int tr = target[1];

        if((sl + sr) % 2 != (tl + tr) % 2){
            return -1;
        }
        if(sl == tl && sr == tr){
            return 0;
        }
        if(Math.abs(sl - tl) == Math.abs(sr - tr)){
            return 1;
        }
        return 2;
    }
}