/*
 * Problem Link : https://leetcode.com/problems/can-place-flowers/
 * Solution Link : https://leetcode.com/problems/can-place-flowers/solutions/1698539/by-explanation-i-made-it-so-easy/
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 *
 */

class Q605_Can_Place_Flowers 
{
    public boolean canPlaceFlowers(int[] flowerbed, int n) 
    {
        int count = 0;

        for(int index=0 ; index<flowerbed.length ; index++)
        {
            if(flowerbed[index] == 0)
            {
                int previous = (index == 0 || flowerbed[index-1] == 0) ? 0 : 1;
                int next = (index == flowerbed.length-1 || flowerbed[index+1] == 0) ? 0 : 1;

                if(previous == 0 && next == 0)
                {
                    count++;
                    flowerbed[index] = 1;
                }
            }
        }
        
        return count >= n;
    }
}
