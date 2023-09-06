/* 
 * Problem Link : https://leetcode.com/problems/increasing-triplet-subsequence/
 * Solution Link : https://www.youtube.com/watch?v=yEFlGWOVH8g
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */

class Q334_Increasing_Triplet_Subsequence 
{
    public boolean increasingTriplet(int[] nums) 
    {
        if(nums.length < 3)
            return false;

        int i = Integer.MAX_VALUE;
        int j = Integer.MAX_VALUE;
        int k = Integer.MAX_VALUE;

        for(int value : nums)
            if(value <= i)
                i = value;
            else if(value <= j)
                j = value;
            else
                return true;

        return false;
    }
}
