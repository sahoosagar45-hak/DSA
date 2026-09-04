class Solution {
    public void setZeroes(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(matrix[i][j] == 0){
                    list.add(i);
                    list.add(j);
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {

            if (i % 2 == 0) {
                // list[i] = row
                for (int col = 0; col < m; col++) {
                    matrix[list.get(i)][col] = 0;
                }
            }
            else {
                // list[i] = column
                for (int row = 0; row < n; row++) {
                    matrix[row][list.get(i)] = 0;
                }
            }
        }

    }
}