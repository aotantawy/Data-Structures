# LinkedList 

![Singly LinkedList](https://media.geeksforgeeks.org/wp-content/cdn-uploads/gq/2013/03/Linkedlist.png "Singly LinkedList src:geeksforgeeks.com")

- ___Definition:___ it's a linear data structure, in which elements are stored in non-contiguous memory locations, and each element points to the next one through a pointer.
- ___Complexity:___ 

	| Operation | Complexity | Notes |
	| ---  		| 	---		 | ---	 |
	| Access    | O(n)		 | ---     |
	| Search    | O(n)       | ---     |
	| Insert    | O(n)  	 | because you have to access the element first which takes O(n), but if you will insert an item as ahead it will take O(1) |
	| Delete    | O(n)       | because you have to access the element first which takes O(n), but if you will delete the head it will take O(1) |

	> where n is the number of elements.
	

- ___Notes:___
	1. LinkedList is very useful and efficient when most of your operations are inserting and deleting.
	1. LinkedList is not preferred when most of your operations are accessing or searching.
	1. We have talked about one type of LinkedLists (singly linked list) but there are many more like: 
		- [doubly LinkedList](https://www.programiz.com/dsa/linked-list-types#doubly) .
		- [circular LinkedList](https://www.programiz.com/dsa/linked-list-types#circular).
		- [Doubly circular LinkedList](https://www.geeksforgeeks.org/doubly-circular-linked-list-set-1-introduction-and-insertion).
	<br/><br/>

	| Problem | Website | Solution| 
	| ---     |  ---    | ---     |
	|[Merge two sorted lists](https://leetcode.com/problems/merge-two-sorted-lists/)|LeetCode|[Solution](./Problems/Merge_two_sorted_lists.java)|
	|[Rotate List](https://leetcode.com/problems/rotate-list/)|LeetCode|[Solution](./Problems/Rotate_list.java)|