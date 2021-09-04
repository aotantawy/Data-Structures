/**
 * @author Ahmed Osama Tantawy
 * 
 *         Description: count max consecutive ones in a given array
 * 
 *         Constrains: 1 <= n <= 10^5
 * 
 *         Overall Complexity: O(n)
 * 
 */

public class Max_consecutive_ones_485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        int summation = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                summation++;
                if (i + 1 == nums.length) {
                    result = Math.max(result, summation);
                }
            } else {
                result = Math.max(result, summation);
                summation = 0;
            }
        }
        return result;
    }

    public static void main(String[] args) {
    }
}