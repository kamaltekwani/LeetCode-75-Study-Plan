/*
 * Problem Link :  https://leetcode.com/problems/unique-number-of-occurrences/
 * Solution Link : https://leetcode.com/problems/unique-number-of-occurrences/solutions/1942038/fastest-java-solution-using-hashmap-hashset/?envType=study-plan-v2&envId=leetcode-75
 *
 * Time Complexity : O(N)
 * Space Complexity : O(N)
 */


class Q1207_Unique_Number_of_Occurrences 
{
    public boolean uniqueOccurrences(int[] arr) 
    {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int value : arr)
            map.put(value, map.getOrDefault(value, 0)+1);

        Set<Integer> set = new HashSet<Integer>(map.values());

        return map.size() == set.size();
    }
}
