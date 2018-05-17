class Solution
{
    public int myAtoi(String str)
    {

        String str1 = str.trim();
        if(str1.equals(""))
        {
            return 0;
        }

        int sign = 1;
        long res = 0;
        if (str1.charAt(0) == '-')
        {
            sign = -1;
        }
        if (str1.charAt(0) == '+')
        {
            sign = 1;
        }
        if (str1.charAt(0) == '+' || str1.charAt(0) == '-')
        {
            for(int i = 1; i < str1.length(); i++)
            {
                if(str1.charAt(i) <= '9' && str1.charAt(i) >='0')
                {
                    res = res*10 + str1.charAt(i) - '0';
                    if (sign == -1)
                    {
                        if (res*sign <Integer.MIN_VALUE)
                        {
                           return Integer.MIN_VALUE;
                        }
                    }
                    else
                    {
                        if (res >Integer.MAX_VALUE)
                        {
                           return Integer.MAX_VALUE;
                        }
                    }

                }
                else break;
            }
        }
        else
        {
            for(int i = 0; i < str1.length(); i++)
            {
                if(str1.charAt(i) <= '9' && str1.charAt(i) >='0')
                {
                    res = res*10 + str1.charAt(i) - '0';
                    if (res > Integer.MAX_VALUE)
                    {
                        return Integer.MAX_VALUE;
                    }

                }
                else break;
            }
        }
        int val = (int)res;
        return val*sign;
    }
}
