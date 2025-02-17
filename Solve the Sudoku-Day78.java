class Solution {
    static boolean isSafe(int[][] mat,int i, int j, int num,int[] row, int[] col, int[] box){
        int boxIndex = (i/3)*3 + (j/3);
        if((row[i] & (1<<num)) != 0 || (col[j] &(1<<num)) != 0 || (box[(i/3)*3+j/3] & (1<<num)) != 0)
        return false;
        return true;
    }                                                      
    static boolean sudokuSolverRec(int[][] mat,int i, int j,int[] row , int[] col, int[] box){
        int n = mat.length;
        if(i==n-1 && j==n)
        return true;
        if(j==n){
            i++;
            j=0;
        }
        if(mat[i][j] != 0)
        return sudokuSolverRec(mat,i,j+1,row,col,box);
        for(int num = 1; num<=n;num++){
            if(isSafe(mat,i,j,num,row,col,box)){
                mat[i][j]=num;
                row[i] |= (1<<num);
                col[j] |= (1<<num);
                box[(i/3)*3+j/3] |= (1<<num);
                if(sudokuSolverRec(mat,i,j+1,row,col,box))
                    return true;
                mat[i][j]=0;
                row[i] &= ~(1<<num);
                col[j] &= ~(1<<num);
                int boxIndex=(i/3)*3+(j/3);
                box[boxIndex] &= ~(1<<num);
            }
        }
        return false;
    }
    static void solveSudoku(int[][] mat) {
        int n = mat.length;
        int[] row = new int[n];
        int[] col = new int[n];
        int[] box = new int[n];
        
        for(int i = 0;i<n;i++){
            for(int j=0;j<n;j++){
                if (mat[i][j] != 0){
                    row[i] |= (1<<mat[i][j]);
                    col[j] |= (1<<mat[i][j]);
                    int boxIndex = (i/3)*3+(j/3);
                    box[boxIndex] |= (1<<mat[i][j]);
                }
            }
        }
        sudokuSolverRec(mat,0,0,row,col,box);
    }
}
