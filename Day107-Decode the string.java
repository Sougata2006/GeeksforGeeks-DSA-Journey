
class Solution {
    static String decodeString(String s) {
        // code here
        StringBuilder res = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)!=']'){
                res.append(s.charAt(i));
            }
            else{
                StringBuilder temp = new StringBuilder();
                while(res.length()>0 && res.charAt(res.length()-1)!='['){
                    temp.insert(0,res.charAt(res.length()-1));
                    res.deleteCharAt(res.length()-1);
                }
                res.deleteCharAt(res.length()-1);
                StringBuilder num = new StringBuilder();
                while(res.length()>0 && Character.isDigit(res.charAt(res.length()-1))){
                    num.insert(0,res.charAt(res.length()-1));
                    res.deleteCharAt(res.length()-1);
                }
                int p = Integer.parseInt(num.toString());
                for(int j=0;j<p;j++){
                    res.append(temp.toString());
                }
            }
        }
        return res.toString();
    }
}
