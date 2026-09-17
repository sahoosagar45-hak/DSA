class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
         HashSet<Integer> ans = new HashSet<>();
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums1){
            set.add(num);
        }
        for (int data : nums2){
            if(set.contains(data)){
                ans.add(data);
            }
        }
        int[] result = new int[ans.size()];

        int i = 0;
        for (int num : ans) {
            result[i++] = num;
        }

        return result;
    }
}