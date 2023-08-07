class Solution {
    public static String base_n(int n, int base)
    {
        String str0="";
        while (n>0)
        {
            str0+=n%base;
            n/=base;
        }
        StringBuilder str1 = new StringBuilder(str0);
        str1.reverse();
        return str1.toString();
    }
    public static boolean ispalindrome(String str1)
    {
        for(int i=0; i<str1.length()/2; i++)
        {
            if (str1.charAt(i)!=str1.charAt(str1.length()-i-1))
            {
                return false;
            }
        }
        return true;
    }
    public boolean isStrictlyPalindromic(int n) {
        for(int i=2; i<=n-2; i++)
        {
            String val = base_n(n, i);
            if (!ispalindrome(val))
            {
                return false;
            }
        }
        return true;
    }
}
