/*
 * Problem Link : https://leetcode.com/problems/reverse-words-in-a-string/
 * Solution Link : https://leetcode.com/problems/reverse-words-in-a-string/solutions/3593904/5-line-simple-solution-with-full-explanation/
 *
 * Time Complexity : O(N)
 * Space Complexity : O(N)
 *
 */

class Q151_Reverse_Words_in_a_String 
{
    public String reverseWords(String s) 
    {
        s = s.trim();
        String array[] = s.split("\\s+");
        String result = "";

        for(int index=array.length-1 ; index>0 ; index--)
            result += array[index]+" ";
        
        return result + array[0];
    }
}
