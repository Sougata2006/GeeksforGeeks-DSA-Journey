class Solution {
    public int myAtoi(String s) {
        int sign = 1;  
        int result = 0;  
        int idx = 0;  

        
        while (idx < s.length() && s.charAt(idx) == ' ') {
            idx++;
        }

       
        if (idx < s.length() && (s.charAt(idx) == '-' || s.charAt(idx) == '+')) {
            if (s.charAt(idx++) == '-') {
                sign = -1;
            }
        }

       
        while (idx < s.length() && s.charAt(idx) >= '0' && s.charAt(idx) <= '9') {
            
            if (result > Integer.MAX_VALUE / 10 || 
                (result == Integer.MAX_VALUE / 10 && s.charAt(idx) - '0' > 7)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            
            result = 10 * result + (s.charAt(idx++) - '0');
        }

        return result * sign;  
    }
}
