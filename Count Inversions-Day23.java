class Solution {
    public int inversionCount(int arr[], int l, int r) {
        int count = 0;
        if (l < r) {
            int m = (l + r) / 2;

            count += inversionCount(arr, l, m);

            count += inversionCount(arr, m + 1, r);

            count += mergeAndCount(arr, l, m, r);
        }
        return count;
    }

    public int mergeAndCount(int arr[], int l, int m, int r) {
        int n1 = m - l + 1; 
        int n2 = r - m;   

        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++)
            left[i] = arr[l + i];
        for (int j = 0; j < n2; j++)
            right[j] = arr[m + 1 + j];

        int i = 0, j = 0, k = l, res = 0;

        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
                res += (n1 - i); 
            }
        }

        while (i < n1)
            arr[k++] = left[i++];

        while (j < n2)
            arr[k++] = right[j++];

        return res;
    }


}
