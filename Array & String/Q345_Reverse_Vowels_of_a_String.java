/*
 * Problem Link : https://leetcode.com/problems/reverse-vowels-of-a-string/
 * Solution Link : https://leetcode.com/problems/reverse-vowels-of-a-string/solutions/2775649/java-explained-in-detail-simple-fast-solution-two-pointers/?envType=study-plan-v2&envId=leetcode-75
 *
 * Time Complexity : O(N)
 * Space Complexity : O(N)
 *
 */

class Q345_Reverse_Vowels_of_a_String 
{
    public boolean isVowel(char c)
    {
        return c == 'A' || c == 'I' || c == 'E' || c == 'O' || c == 'U' || c == 'a' || c == 'i' || c == 'e' || c == 'o' || c == 'u';
    }


    public String reverseVowels(String s) 
    {
        int left = 0;
        int right = s.length()-1; 

        char array[] = s.toCharArray();   

        while(left < right)
        {
            if(isVowel(array[left]) && isVowel(array[right]))
            {
                char temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            }
            else if(!isVowel(array[left]))
                left++;
            else if(!isVowel(array[right]))
                right--;
        }

        return new String(array);
    }
}
