class Solution {

    static int mergeAndCount(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        System.arraycopy(arr, left, leftArr, 0, n1);
        System.arraycopy(arr, mid + 1, rightArr, 0, n2);

        int i = 0, j = 0, k = left, invCount = 0;

        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
                invCount += (n1 - i); 
            }
        }

        while (i < n1) {
            arr[k++] = leftArr[i++];
        }

        while (j < n2) {
            arr[k++] = rightArr[j++];
        }

        return invCount;
    }

    static int mergeSortAndCount(int[] arr, int left, int right) {
        int invCount = 0;
        if (left < right) {
            int mid = left + (right - left) / 2;

            invCount += mergeSortAndCount(arr, left, mid);
            invCount += mergeSortAndCount(arr, mid + 1, right);
            invCount += mergeAndCount(arr, left, mid, right);
        }
        return invCount;
    }

    static int inversionCount(int[] arr) {
        return mergeSortAndCount(arr, 0, arr.length - 1);
    }
}
