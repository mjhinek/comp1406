# Assignment 5

## Due  <span style="color:red">Wednesday, August 14th</span> at <span style="color:red">11:59pm</span>

---

Submit a single file called `assignment5.zip` to the submission server

http://134.117.26.180:9091

Your zip file must contain a directory called `comp1406a5` and all of your  `.java` files must be in this directory. Do not include your `.class` files.


---


# 1. Binary Search Tree [50 marks]

Write a class called `StudentBST` that extends `StudentTree` (from Tutorial 5). In this new class, you will _override_ the `find(int id)` method to be more efficient (you can assume the tree is a valid binary search tree based on ID values). You will _override_ the `add()`
to add a student in the proper place so that the resulting tree is a valid binary search tree.

When you override `add()`, if a student with the given ID is already in the tree, your method should do nothing and simply return `this`. 

You will also add a new method

```java
public boolean valid()
```

that checks whether this StudentBST is a valid binary search tree or not.

Note: recall that a binary search tree is a binary tree that also satisfies the **binary search tree property**. The binary search tree property is as follows:

For every node `n` in the tree, 
1) all nodes in the left subtree of `n` have value less than the value of `n`
2) all nodes in the right subtree of `n` have values greater then the value of `n`

For our problem the _value_ of a node is the ID number of the student.  

# 2. Gold [50 marks]


# Submission Recap

A complete assignment will consist of a single file `comp1406a5.zip` that has a single folder/directory called `comp1406a5`. The `comp1406a5` folder will have the following two files included:

```java
StudentBST.java
Gold.java
```

All classes must be in the `comp1406a5` package. That is, all files must have the `package comp1406a5;` directive as the first line. Your code will NOT compile if it does not have this and you will receive zero correctness marks if your code does not compile.
