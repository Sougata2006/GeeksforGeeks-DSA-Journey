class Solution {
    static final int MAX_CHAR =26;
    public int longestUniqueSubstr(String s) {
        
        int n = s.length();
        int res = 0;
        
        int[] lastIndex = new int[MAX_CHAR];
        for(int i=0; i<MAX_CHAR; i++){
            lastIndex[i] = -1;
        }
        int start = 0;
        for(int end =0; end<n;end++){
            start =Math.max(start,lastIndex[s.charAt(end) - 'a']+1);
            res =Math.max(res,end-start+1);
            
            lastIndex[s.charAt(end) -'a'] = end;
        }
        return res;
    }
}
