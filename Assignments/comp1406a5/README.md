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
2) all nodes in the right subtree of `n` have values greater than the value of `n`

For our problem the _value_ of a node is the ID number of the student.  

# 2. Gold [50 marks]

Complete the `Gold` class. You will have to complete the `findGold()` method and the `computePerimeter()` methods using recursion. 

A `World` is a 2-dimensional grid of `Location`s. Each location might be a wall or not. If it is not a wall it might have gold and it might not. Each location has four sides to it. You are NOT allowed to move through a wall. A location might be at the edge of the world. You are not allowed to move off of the world (you'll likely throw a null pointer exception).

The `findGold()` method will return the total amount of gold that you can find in the world that is reachable from the specified starting location.

The `computePerimeter()` method description is coming...

The _perimieter_ is defined as the sum of all sides of each location that is reachable in a world (from some starting location) that has a wall on the other side of it. In the following example, white cells denote walls. The perimeter is shown for each(if calculated from any starting location that is not a wall (in black)

![world](pix4.png?raw=true "World1")
![world](pix5.png?raw=true "World3")
![world](pix6.png?raw=true "World2")

For this problem, I would suggest that you extend the provided `Location` class to add state and potentially behaviour as you see fit. In your code you can use your child class. Be sure that you do NOT modify the `World` and `Location` classes though. We will test your code by simply calling the two methods in the `Gold` class with different worlds and starting points.  

# Submission Recap

A complete assignment will consist of a single file `comp1406a5.zip` that has a single folder/directory called `comp1406a5`. The `comp1406a5` folder will have the following two files included:

```java
StudentBST.java
Gold.java
```

All classes must be in the `comp1406a5` package. That is, all files must have the `package comp1406a5;` directive as the first line. Your code will NOT compile if it does not have this and you will receive zero correctness marks if your code does not compile.
