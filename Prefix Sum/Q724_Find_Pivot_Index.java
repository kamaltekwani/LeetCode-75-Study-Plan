/*
 * Problem Link : https://leetcode.com/problems/find-pivot-index/
 * Solution Link : https://leetcode.com/problems/find-pivot-index/solutions/2470014/very-easy-100-fully-explained-java-c-python-js-python3/?envType=study-plan-v2&envId=leetcode-75
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */

class Q724_Find_Pivot_Index 
{
    public int pivotIndex(int[] nums) 
    {
        int sum = 0;
        int current = 0;

        for(int value : nums)
            sum += value;

        for(int index=0 ; index<nums.length ; index++)
        {
            if( (current * 2) == (sum - nums[index]))
                return index;
            current += nums[index];
        }

        return -1;
    }
}



