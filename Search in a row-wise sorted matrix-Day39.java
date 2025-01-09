class Solution {
    
    public boolean searchRowMatrix(int[][] mat, int x) {

   int row = mat.length;
   int no_e = mat[0].length;
   for (int i = 0 ; i< row ; i++)
   {
       for (int j = 0; j<no_e; j++){
           if(mat[i][j] == x){
               return true;
           }
       }
   }
   return false;
    }
}
