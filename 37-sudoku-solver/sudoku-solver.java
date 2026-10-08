class Solution {
    static boolean isSafePlace(char[][] bord, char charValue, int rowIndex, int colIndex){
        // row check
        for(int col = 0; col < 9; col++){
            if(bord[rowIndex][col] == charValue){
                return false;
            }
        }
        // column check
        for(int row = 0; row < 9; row++){
            if(bord[row][colIndex] == charValue){
                return false;
            }
        }

        // 3 X 3 Box check
        int stratRowIndex = rowIndex - (rowIndex % 3);
        int startColIndex = colIndex - (colIndex % 3);
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                int actualRowIndex = stratRowIndex + i;
                int actualColIndex = startColIndex + j;
                if(bord[actualRowIndex][actualColIndex] == charValue){
                    return false;
                }
            }
        }
        return true;
    }
    
    static boolean findEmptycell(char[][] board, int[] emptyCell){
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(board[i][j] == '.'){
                    emptyCell[0] = i;
                    emptyCell[1] = j;
                    return true;
                }
            }
        }
        return false;
    }

    static boolean solveSudokuProblem(char[][] board){
        int[] empty = new int[2];
        if(!findEmptycell(board, empty)){
            return true;
        }
        int rowIndex = empty[0];
        int colIndex = empty[1];

        // Check every possible value
        for(int value = 1; value <= 9; value++){
            char charValue = (char) (value + '0');
            if(isSafePlace(board, charValue, rowIndex, colIndex)){
                board[rowIndex][colIndex] = charValue;

                // recusion call
                if(solveSudokuProblem(board) == true){
                    return true;
                }
                board[rowIndex][colIndex] = '.';
            }
        }
        // not able to solve this problem
        return false;
    }

    public void solveSudoku(char[][] board) {
        solveSudokuProblem(board);
    }
}