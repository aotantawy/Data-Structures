# Arrays

![Arrays in memory](https://media.geeksforgeeks.org/wp-content/uploads/Arrays-1.png "Arrays in memory src:geeksforgeeks.com")
- ___Definition:___ It's a data structure that stores a collection of elements in contiguous memory locations.
- ___Complexity:___

	|Operations | Complexity|
	| ---      | ---       |
	| Access   | O(1)      |
	| -Linear- Search   | O(n) |
	| Insert   |   O(1), if array is not full |
	| Append   | O(n), if array is not full|
	| Delete   | O(n) | 

	> where n is the number of elements.

- ___Notes:___
	1. If you have a large set of elements you may find a problem in storing them in contiguous locations.
	2. If you don't know how many elements will be stored so you may end with:
		1. allocating too much memory that will never be used (inefficient).
		1. allocating few memory locations (solution: use dynamic arrays).
	<br/><br/>

	| Problem | Website | Solution| 
	| ---     |  ---    | ---     |
	|[Max Consecutive Ones](https://leetcode.com/problems/max-consecutive-ones)|LeetCode|[Solution](./Problems/Max_consecutive_ones.java)|
	|[Find Numbers with Even Number of Digits](https://leetcode.com/problems/find-numbers-with-even-number-of-digits)|LeetCode|[Solution](./Problems/Find_numbers_with_even_number_of_digits.java)|
	|[Squares of a Sorted Array](https://leetcode.com/problems/squares-of-a-sorted-array)|LeetCode|[Solution](./Problems/Squared_of_a_sorted_array.java)|