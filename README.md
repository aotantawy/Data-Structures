<img src="https://miro.medium.com/max/1400/1*sMryEXZVPKFjGNcfSzE8Mw.jpeg" title="data structures and algorithms src:medium.com" alt="data structures and algorithms src:medium.com" width="100%" height="500px" />

# Table of Contents

- [Introduction](#introduction)
	- [What is data structure?](#what-is-data-structure)
	- [What is an algorithm?](#what-is-an-algorithm)
	- [Why data structures and algorithms are so important?](#why-data-structures-and-algorithms-are-so-important)
- [Complexity analysis](#complexity-analysis)
	- [What is complexity?](#what-is-complexity)
	- [Why complexity is needed](#why-complexity-is-needed)
	- [Difference between Omega, Theta, and Big-O notations](#difference-between-omega-theta-and-big-o-notations)
	- [Growth of complexity functions](#growth-of-complexity-functions)
- [Data Structures](#data-structures)
	- [Arrays](#arrays)
 

## Introduction

### What is data structure?

- It's a container for managing and storing data that has a defined internal structure.


### What is an Algorithm?

- It's a well-defined, finite step-by-step process that transforms some input into some output. 

![algorithm src:geeksforgeeks.com](https://media.geeksforgeeks.org/wp-content/cdn-uploads/20191016135223/What-is-Algorithm_-1024x631.jpg "algorithm src:geeksforgeeks.com")


### Why data structures and algorithms are so important?

- Being good at data structures and algorithms will enable you to write efficient programs which use computations resources wisely and have the most optimal time complexity.


## Complexity analysis

### What is complexity?

- It's the study of the algorithm behavior when the input size tends to infinity.

### Why complexity is needed?

- The main reason for needing complexity is to compare different algorithms and find which one is better.

### Difference between Omega, Theta, and Big-O notations

| Point | Omega | Theta | Big-O |
| :---: | :---: | :---: | :---: |
|notation | Ω   | Θ     |   O   |
| calculation | best case | average case | worst case|
| graph representation | ![Omega graph src:geeksforgeeks.com](https://media.geeksforgeeks.org/wp-content/uploads/AlgoAnalysis-3.png "Omega graph src:geeksforgeeks.com") | ![Theta graph src:geeksforgeeks.com](https://media.geeksforgeeks.org/wp-content/uploads/AlgoAnalysis-1.png "Theta graph src:geeksforgeeks.com") | ![Big-O graph src:geeksforgeeks.com](https://media.geeksforgeeks.org/wp-content/uploads/AlgoAnalysis-2.png "Big-O graph src:geeksforgeeks.com")|


### Growth of complexity functions

![Growth of complexity functions src:algorithmsandme.com](https://secureservercdn.net/160.153.137.40/662.aa9.myftpupload.com/wp-content/uploads/2019/11/Time-Complexity.png "Growth of complexity functions src:algorithmsandme.com")

# Data Structures

## Arrays

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
	|[Max Consecutive Ones](https://leetcode.com/problems/max-consecutive-ones)|LeetCode|[Solution](/solutions/Max_consecutive_ones_485.java)|
	|[Find Numbers with Even Number of Digits](https://leetcode.com/problems/find-numbers-with-even-number-of-digits)|LeetCode|[Solution](/solutions/Find_numbers_with_even_number_of_digits_1259.java)|
	|[Squares of a Sorted Array](https://leetcode.com/problems/squares-of-a-sorted-array)|LeetCode|[Solution](/solutions/Squared_of_a_sorted_array_977.java)|
