// Problem Link: https://leetcode.com/problems/longest-substring-without-repeating-characters/

/**
* @author Ahmed Osama Tantawy
* 
*         Objective: get length of the longest substring without repeating chars
* 
*         Constrains: 0 <= s <= 5*10^4
* 
*         Strategy: bound substring using pointers
*
*         Overall Complexity: O(s)
* 
*/

public class Longest_substring_without_repeating_characters{
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Boolean> charExist = new HashMap<>();
        int leftPointer = 0, rightPointer = 0;
        int maxLength = 0,currentLength = 0;
        
        while (rightPointer<s.length()) {
            if (charExist.getOrDefault(s.charAt(rightPointer),false)){ // Character exists
                maxLength = Math.max(maxLength,currentLength);
                charExist.put(s.charAt(leftPointer),false);
                currentLength--;
                leftPointer++;
            } else { // Character doesn't exit
                charExist.put(s.charAt(rightPointer),true);
                currentLength++;
                rightPointer++;
            }
        }
        
        maxLength = Math.max(maxLength,currentLength);
        
        return maxLength;
    }
}