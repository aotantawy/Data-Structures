import java.util.Arrays;

/**
 * @author Ahmed Osama Tantawy
 * 
 *         Description: Given a sorted array square the elements then return the
 *         sorted version of the squared elements
 * 
 *         Constrains: 1 <= n <= 10^4, -10^4 <= nums[i] <= 10^4
 * 
 *         Strategy: 1- square each element in array 2- sort the array again 3-
 *         return sorted array
 *
 *         Overall Complexity: O(nlog(n))
 * 
 */

public class Squared_of_a_sorted_array {
    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] *= nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}