public class Solution {
    public String reverseWords(String s)
    {
        String result = "";
        String str = s.trim().replaceAll(" +", " ");
        String [] arrStr = str.split(" ");
        for (int i = arrStr.length; i>0; i--)
        {
            result += arrStr[i-1];
            result += " ";
        }
        return result.trim();
    }
}
