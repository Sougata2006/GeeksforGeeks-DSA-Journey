
class Solution {
    public List<String> camelCase(String[] arr, String pat) {
        
        List <String> res = new ArrayList<>();
        for(String word :arr){
            int i=0,j=0;
            while(i<word.length()&&j<pat.length()){
                if(Character.isLowerCase(word.charAt(i))){
                    i++;
                }
                else if(word.charAt(i) != pat.charAt(j)){
                    break;
                }
                else{
                    i++;
                    j++;
                }
            }
            if(j==pat.length())
            res.add(word);
        }
        return res;
    }
}
