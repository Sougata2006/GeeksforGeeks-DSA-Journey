class Solution {
    public ArrayList<Integer> spirallyTraverse(int mat[][]) {

        int m = mat.length;
        int n = mat[0].length;

        ArrayList<Integer> res = new ArrayList<>();

        int top = 0, bottom = m - 1, left = 0, right = n - 1;

        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; ++i) {
                res.add(mat[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; ++i) {
                res.add(mat[i][right]);
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; --i) {
                    res.add(mat[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; --i) {
                    res.add(mat[i][left]);
                }
                left++;
            }
        }

        return res;
    }
        
}
