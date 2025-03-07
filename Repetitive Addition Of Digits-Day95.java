class Solution {
    public int singleDigit(int n) {
        if(n==0)
        return 0;
        
        if(n%9 ==0)
        return 9;
        return (n%9);
    }
}
