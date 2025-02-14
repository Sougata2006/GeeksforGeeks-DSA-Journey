class Solution {
    static void genPermutations(int n,StringBuilder curr,
    Map<Character,Integer> cnt,List<String> res){
        if(curr.length()==n){
            res.add(curr.toString());
            return;
        }
        for(Map.Entry<Character,Integer> entry : cnt.entrySet()){
            char c = entry.getKey();
            int count = entry.getValue();
            
            if(count == 0)
            continue;
            
            curr.append(c);
            cnt.put(c,count-1);
            
            genPermutations(n,curr,cnt,res);
            
            curr.deleteCharAt(curr.length()-1);
            cnt.put(c,count);
        }
    }
    public static ArrayList<String> findPermutation(String s) {
        // Code here
        Map<Character,Integer> cnt = new HashMap<>();
        ArrayList<String> res = new ArrayList<>();
        for(char c:s.toCharArray())
        cnt.put(c,cnt.getOrDefault(c,0)+1);
        
        StringBuilder curr = new StringBuilder();
        genPermutations(s.length(),curr,cnt,res);
        return res;
        
    }
}
