class Solution {
    static void nQueenUtil(int j, int n, ArrayList<Integer> board, boolean[] rows, boolean[] diag1, boolean[] diag2,ArrayList<ArrayList<Integer>> res)
{
    if(j==n){
        res.add(new ArrayList<>(board));
        return;
    }
    for(int i=0;i<n;i++){
    if(!rows[i] && !diag1[i+j] && !diag2[i-j+(n-1)]){
        rows[i] =diag1[i+j]=diag2[i-j+(n-1)]=true;
        board.add(i+1);
        
        nQueenUtil(j+1,n,board,rows,diag1,diag2,res);
        board.remove(board.size()-1);
        rows[i]=diag1[i+j]=diag2[i-j+(n-1)]=false;
      }    
    }
}
    public ArrayList<ArrayList<Integer>> nQueen(int n) {
        // code here
        ArrayList<ArrayList<Integer>> res =new ArrayList<>();
        ArrayList<Integer> board =new ArrayList<>();
        boolean[] rows = new boolean[n];
        boolean[] diag1 = new boolean[2*n-1];
        boolean[] diag2 = new boolean[2*n-1];
        
        nQueenUtil(0,n,board,rows,diag1,diag2,res);
        return res;
        
    }
}
