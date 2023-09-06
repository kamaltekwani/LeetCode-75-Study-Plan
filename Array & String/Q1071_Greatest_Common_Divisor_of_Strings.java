/*
 * Problem Link : https://leetcode.com/problems/greatest-common-divisor-of-strings/
 * Solution Link : https://leetcode.com/problems/greatest-common-divisor-of-strings/solutions/3124997/super-easy-solution-fully-explained-c-python3-java/
 *  
 * Time Complexity : O(N)
 * Space Complexity : O(N)
 */

class Q1071_Greatest_Common_Divisor_of_Strings 
{
    public int gcd(int a, int b)
    {
        return b == 0 ? a : gcd(b, a%b);
    }    

    public String gcdOfStrings(String str1, String str2) 
    {
        if(!(str1+str2).equals(str2+str1))
            return "";
        int gcd = gcd(str1.length(),str2.length());
        return str1.substring(0, gcd);
    }
}
