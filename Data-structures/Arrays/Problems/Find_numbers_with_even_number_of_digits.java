/**
 * @author Ahmed Osama Tantawy
 * 
 *         Description: Count how many elements have event number of digits
 * 
 *         Constrains: 1 <= n <= 500, 1 <= m <= 10^5
 * 
 *         Strategy: 1- Count number of digits 2- Count number of even digits
 *
 *         Overall Complexity: O(n*m) where n is the number of elements in array
 *         and m is the number of digits of a certain element
 * 
 */

public class Find_numbers_with_even_number_of_digits {

    public int countNumberOfDigits(int element) {
        int numDigits = 0;
        while (element > 0) {
            numDigits++;
            element /= 10;
        }
        return numDigits;
    }

    public int findNumbers(int[] nums) {
        int numEvenDigits = 0;
        for (int element : nums) {
            numEvenDigits += countNumberOfDigits(element) % 2 == 0 ? 1 : 0;
        }
        return numEvenDigits;
    }

    public static void main(String[] args) {
    }
}