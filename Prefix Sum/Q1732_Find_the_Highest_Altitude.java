/*
 * Problem Link : https://leetcode.com/problems/find-the-highest-altitude/solutions/3654693/beats-100-c-java-python-beginner-friendly/?envType=study-plan-v2&envId=leetcode-75
 * Solution Link : https://leetcode.com/problems/find-the-highest-altitude/solutions/3654693/beats-100-c-java-python-beginner-friendly/?envType=study-plan-v2&envId=leetcode-75
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */

class Q1732_Find_the_Highest_Altitude
{
    public int largestAltitude(int[] gain) 
    {
        int max = 0;
        int sum = 0;

        for(int value : gain)
        {
            sum += value;
            max = Math.max(max, sum);
        }
        return max;
    }
}
