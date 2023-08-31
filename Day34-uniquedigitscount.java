class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n==0)
            return 1;
        int sta=9,cur=9,ans=10;
        while(sta>0&&n>1)
        {
            cur*=sta;
            sta--;
            ans+=cur;
            n--;
        }
        return ans;
    }
}
