# Hash Table

![hashing data structure src:geeksforgeeks.com](https://media.geeksforgeeks.org/wp-content/cdn-uploads/HashingDataStructure-min-1024x512.png "hashing data structure src:geeksforgeeks.com")

- ***Definition:*** 
	- it's a data structure which associate key-value pair into an index by using hash function.
	- hash function: it's one way mathematical function that map key-value pair into a set of indecies.
- ***Complexity:***
	| Operation | Complexity |
	| ---       |   ---      |
	| Access    |  O(1)      |
	| Search    | O(1)       |
	| Insert    |  O(1)      |
	| Delete    | O(1)       |

	> **Note:** complexity may change in some cases based on how the hash table is implemented. 

- ***Notes:***
	- hash table uses array to store key value pairs.
	- it takes a huge memory space in order to avoid collision.
	- hash tables commonly used when:
		- inserting and retrieving data is a big deal.
		- key type is not suitable to be stored in array (strings, negative values).
- ***Useful Links:***
	- [Hash Table](https://www.tutorialspoint.com/data_structures_algorithms/hash_data_structure.htm)
	- [Hash Function](https://www.geeksforgeeks.org/what-are-hash-functions-and-how-to-choose-a-good-hash-function/)
	- [Collision](https://www.tutorialandexample.com/collision-resolution-techniques-in-data-structure/)
- ***Problems:***
	<br/>

	| Problem | Website | Solution |
	| 	---   |	--- 	| ---	   |
	| [Hash Tables: Ransom Note](https://www.hackerrank.com/challenges/ctci-ransom-note/problem?h_r=internal-search)| HackerRank | [Solution](./Problems/Hash_tables_ransom_note.java)
	| [Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/)|LeetCode | [Solution](./Problems/Longest_substring_without_repeating_characters.java)|
    
