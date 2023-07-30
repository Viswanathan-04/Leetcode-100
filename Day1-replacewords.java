class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        String str[] = sentence.split(" ");
        for (String i : dictionary)
        {
            for(int j=0; j<str.length; j++)
            {
                if (str[j].startsWith(i))
                {
                    str[j] = i;
                }
            }
        }
        String str1="";
        for(int i=0;i<str.length-1;i++)
        {
            str1+=(str[i]+" ");
        }
        str1+=str[str.length-1];
        return str1;
    }
}
