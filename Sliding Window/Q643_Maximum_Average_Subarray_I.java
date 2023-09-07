/*
 * Problem Link : https://leetcode.com/problems/maximum-average-subarray-i/
 * Solution Link : https://www.youtube.com/watch?v=jS1_eAGof5U
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */

class Q643_Maximum_Average_Subarray_I 
{
    public double findMaxAverage(int[] nums, int k) 
    {
        int left = 0;
        int right = 0;

        double sum = 0;

        for(int index=0 ; index<k ; index++)
            sum += nums[index];

        double average = sum / (double) k;

        for(int index=k ; index<nums.length ; index++)
        {
            sum += nums[index] - nums[index-k];
            average = Math.max(average, sum / k);
        }   

        return average;
    }
}
