class Solution {
    public int numDecodings(String s) {
        int arr[] = new int[s.length()];
        if(s.charAt(0) == '0')
            return 0;
        else 
            arr[0] = 1;
        for(int i=1;i<s.length();i++){
            int cur = s.charAt(i)-'0';
            int prev = s.charAt(i-1)-'0';
            if(prev*10+cur<27 && prev!=0){
                if(i-2>-1)arr[i] += arr[i-2];
                else arr[i]+=1;
            }
            if(cur != 0)arr[i]+=arr[i-1];
        }
        return arr[s.length()-1];
    }
}
