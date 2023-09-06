/*
 * Problem Link : https://leetcode.com/problems/merge-strings-alternately/
 * Solution Link : https://leetcode.com/problems/merge-strings-alternately/solutions/3429116/easy-solutions-in-java-python-and-c-look-at-once-with-exaplanation/
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */

class Q1768_Merge_Strings_Alternately 
{
    public String mergeAlternately(String word1, String word2) 
    {
        StringBuilder sb = new StringBuilder();
        
        int i=0;
        int j=0;
        
        while(i<word1.length() || j<word2.length())
        {
            if(i<word1.length())
                sb.append(word1.charAt(i++));

            if(j<word2.length())
                sb.append(word2.charAt(j++));
        }

        return sb.toString();
    }
}
