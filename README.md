# Data structures tutorial 

## Table of contents
- [Day 1: Introduction](#day-1-introduction)
- [Day 2: Arrays](#day-2-arrays)

<img src="https://kshitizsaini113.hashnode.dev/_next/image?url=https%3A%2F%2Fcdn.hashnode.com%2Fres%2Fhashnode%2Fimage%2Fupload%2Fv1603947146986%2FJDRm1-Mz6.png%3Fw%3D1600%26h%3D840%26fit%3Dcrop%26crop%3Dentropy%26auto%3Dcompress%2Cformat%26format%3Dwebp&w=1920&q=75" width="100%" height="500px" title="Data structures, src: hashnode.dev" alt="data structures banner">


## Day 1: Introduction 

### What is data structure?

- it's a container for managing and storing data in such a way that enables querying and manipulating this data efficiently.

### Why are data structures so important?

- choosing the right data structure will:
    1. make your code more concise and clean.
    2. reduce usage of the computational resources.
    3. affect time and space complexity.

### Abstract data types vs Data structures 

- abstract data types define interface for the behavior while data structures define -several- implementation(s) for this interface.

   [Stack overflow question](https://stackoverflow.com/questions/10267084/what-is-adt-abstract-data-type)

---

## Day 2: Arrays 

### What are arrays?

- it's a container that stores a set of data in a contiguous location inside the memory.

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
