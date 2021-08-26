# Data structures tutorial 

## Table of contents
1. [Section 1: Introduction](#section-1-introduction)
    1. [What is Data Structure?](#what-is-data-structure)
    1. [Why are Data structures so important?](#why-are-data-structures-so-important)
    1. [Abstract data types vs Data structures](#abstract-data-types-vs-data-structures)

1. [Section 2: Arrays](#section-2-arrays)
    1. [What are arrays?](#what-are-arrays)
    1. [How are arrays stored in the memory?](#how-are-arrays-stored-in-the-memory)
    1. [Static vs Dynamic arrays](#static-vs-dynamic-arrays)
    1. [Complexity analysis](#complexity-analysis)

<img src="https://kshitizsaini113.hashnode.dev/_next/image?url=https%3A%2F%2Fcdn.hashnode.com%2Fres%2Fhashnode%2Fimage%2Fupload%2Fv1603947146986%2FJDRm1-Mz6.png%3Fw%3D1600%26h%3D840%26fit%3Dcrop%26crop%3Dentropy%26auto%3Dcompress%2Cformat%26format%3Dwebp&w=1920&q=75" width="100%" height="500px" title="Data structures, src: hashnode.dev" alt="data structures banner">


## Section 1: Introduction 

### What is data structure?

- it's a container that stores, manipulate & retrieve data based on his internal structure (how he stores data).

### Why are data structures so important?

1. To produce efficient programs which: 
    1. Uses computational resources wisely 
    1. Reduces time and space complexity


> **Note :** in order to produce the most optimal and efficient program you have to choose your data structures wisely based on the situation you are currently in.

### Abstract data types vs Data structures 

- abstract data types define interface for the behavior while data structures define the implementation (how are data will be stored inside memory)

   [Stack overflow question](https://stackoverflow.com/questions/10267084/what-is-adt-abstract-data-type)

## Section 2: Arrays 

### What are arrays?

- it's a container that stores a set of data in a contiguous location inside the memory

### How are arrays stored in the memory? 

| Index 0 | Index 1 | Index 2 | ... | Index n|
| :---:   |:---:    |:---:    |:---:|:---:   | 
| value 0| value 1  | value 2 | ... | value n|


### Static vs Dynamic arrays 

| Point | Static Array | Dynamic Array|
| :---:     |  :---:       | :---:    |
| Length   | Fixed         | Variable |
| Creation | @Compilation time| @Runtime |
| Memory location | Stack | Heap     |  


### Complexity analysis 

| Operation | Static Array | Dynamic Array|
| :---:     |  :---:       | :---:        |
| Access    | O(1)         |  O(1)        |
| Search    | O(n)         | O(n)         |
| Insertion | N/A          | O(n)         |
| Appending | N/A          | O(1)         |
| Deletion  | N/A          | O(n)         | 
