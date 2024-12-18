class Solution {
    static final int MAX_CHAR = 26;

    static char nonRepeatingChar(String s) {
       
        int[] vis = new int[MAX_CHAR]; 
        Arrays.fill(vis, -1);
        for (int i = 0; i < s.length(); i++) {
            int charIndex = s.charAt(i) - 'a'; 
            if (vis[charIndex] == -1) {
                vis[charIndex] = i; 
            } else {
                vis[charIndex] = -2; 
            }
        }

      
        int idx = Integer.MAX_VALUE;
        for (int i = 0; i < MAX_CHAR; i++) {
            if (vis[i] >= 0) {
                idx = Math.min(idx, vis[i]);
            }
        }

       
        return (idx == Integer.MAX_VALUE) ? '$' : s.charAt(idx);
    }
}
