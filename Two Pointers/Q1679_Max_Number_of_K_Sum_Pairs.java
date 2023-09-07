/*
 * Problem Link : https://leetcode.com/problems/max-number-of-k-sum-pairs/
 * Solution Link : https://www.youtube.com/watch?v=FevSHchkCeo
 *
 * Approach : Sorting the Array and Using Two Pointers
 * Time Complexity : O(N log N) 
 * Space Complexity : O(1)
 *
 * Approach : Using Map to store frequency
 * Time Complexity : O(N)
 * Space Complexity : O(N)
 */
 

class Q1679_Max_Number_of_K_Sum_Pairs 
{
    /*
    public int maxOperations(int[] nums, int k) 
    {
        Arrays.sort(nums);

        int left = 0;
        int right = nums.length-1;
        int count = 0;

        while(left < right)
        {
            if(nums[left] + nums[right] == k)
            {
                count++;
                left++;
                right--;
            }
            else if(nums[left] + nums[right] < k)
                left++;
            else
                right--;
        }
        return count;
    }
    */

    public int maxOperations(int[] nums, int k) 
    {
        Map<Integer, Integer> map = new HashMap<Integer,Integer>();

        int count = 0;

        for(int value : nums)
            map.put(value, map.getOrDefault(value, 0)+1);

        for(int value : nums)
            if(map.containsKey(value) && map.containsKey(k-value))
                if(value != k-value)
                {
                    count += Math.min(map.get(value), map.get(k-value));
                    map.put(value, 0);
                    map.put(k-value, 0);
                }
                else
                {
                    count += Math.floor(map.get(value)/2);
                    map.put(value, 0);
                }
            
        return count;
    }
}
