class Solution {
    public int minSteps(String s, String t) {
        int count = 0;
        int temp[] = new int[26];
        int val[] = new int[26];
        for(int i=0; i<s.length(); i++){
           temp[s.charAt(i)-'a']++; val[t.charAt(i)-'a']++;
        }
        for(int i=0; i<temp.length; i++){
            if(temp[i]!=val[i]) count+=Math.abs(temp[i]-val[i]);  
        }
        return count/2;
    }
}
