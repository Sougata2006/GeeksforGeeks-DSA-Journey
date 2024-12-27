
class Solution {
    static int minRemoval(int intervals[][]) {
      
        int cnt = 0;

        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);

        int end = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {

            if (intervals[i][0] < end)
                cnt++;

            else
                end = intervals[i][1];
        }

        return cnt;
    }
        
 }
