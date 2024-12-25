class Solution {
    public List<int[]> mergeOverlap(int[][] arr) {
   
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> result = new ArrayList<>();

        int[] current = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (current[1] >= arr[i][0]) {
                current[1] = Math.max(current[1], arr[i][1]);
            } else {
                result.add(current);
                current = arr[i];
            }
        }
        result.add(current);
        return result;
    }
}
