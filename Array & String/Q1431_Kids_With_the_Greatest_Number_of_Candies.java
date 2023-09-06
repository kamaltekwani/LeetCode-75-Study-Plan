/*
 * Problem Link : https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
 * Solution Link : https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/solutions/608614/java-python-3-2-liners-o-n/
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */

class Q1431_Kids_With_the_Greatest_Number_of_Candies
{
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) 
    {
        int max = candies[0];
        List<Boolean> result = new ArrayList<Boolean>();

        for(int candy : candies)
            max = Math.max(max, candy);

        for(int candy : candies)
            result.add(candy + extraCandies >= max);

        return result;      
    }
}
