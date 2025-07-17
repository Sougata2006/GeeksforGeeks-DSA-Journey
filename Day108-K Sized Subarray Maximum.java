class solution{

    static ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
        int n = arr.length;

        ArrayList<Integer> res = new ArrayList<Integer>();

        Deque<Integer> dq = new ArrayDeque<Integer>();

        for (int i = 0; i < k; ++i) {
          
            while (!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]) {
              
                dq.pollLast();
            }

            dq.addLast(i);
        }

        for (int i = k; i < arr.length; ++i) {
          
            res.add(arr[dq.peekFirst()]);

            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
              
                dq.pollFirst();
            }

            while (!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]) {
                dq.pollLast();
            }

            dq.addLast(i);
        }

        res.add(arr[dq.peekFirst()]);

        return res;
    }
