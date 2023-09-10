/*
 * Problem Link : https://leetcode.com/problems/find-the-difference-of-two-arrays/
 *
 * Solution Link : https://leetcode.com/problems/find-the-difference-of-two-arrays/solutions/1886983/simple-solution-using-set-o-n-explained-and-commented/?envType=study-plan-v2&envId=leetcode-75
 *
 * Time Complexity : O(N)
 * Space Complexity : O(N)
 */



class Q2215_Find_the_Difference_of_Two_Arrays 
{
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) 
    {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        Set<Integer> setA = new HashSet<Integer>();
        for(int value : nums1)
            setA.add(value);

        Set<Integer> setB = new HashSet<Integer>();
        for(int value : nums2)
            setB.add(value);

        List<Integer> listA = new ArrayList<Integer>();
        for(int value : setA)
            if(!setB.contains(value))
                listA.add(value);

        List<Integer> listB = new ArrayList<Integer>();
        for(int value : setB)
            if(!setA.contains(value))
                listB.add(value);

        result.add(listA);
        result.add(listB);


        return result;
    }
}
