/*
 * Problem Link : https://leetcode.com/problems/is-subsequence/
 * Solution Link : https://leetcode.com/problems/is-subsequence/solutions/1811546/simple-code-3-lines/
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */

class Q392_Is_Subsequence 
{
    public boolean isSubsequence(String s, String t) 
    {
        int index=0;

        for(int i=0 ; i<t.length() ; i++)
            if(index<s.length() && s.charAt(index) == t.charAt(i))
                index++;
        
        return index == s.length();
    }
}
