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

When you override `find()`, if the search fails you should return `null`. The `find(int id)` method **must** be efficient. That is, it must exploit the fact that the tre is a _binary search tree_. The `find(String name)` will essentially be the same as the one you mad for Tutorial 5. 

You **must** have a zero argument constructor that creates an empty binary search tree. All testing will rely on this constructor. Your grade will be zero for this problem if you do not have this constructor.

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

The `computePerimeter()` method computes the perimater of the reachable world from the specified loction. 

The _perimieter_ is defined as the sum of all sides of each location that is reachable in a world (from some starting location) that has a wall on the other side of it. You can think of this as the total number of walls that you could touch if you were in the world and could walk around starting from the specified start location. In the following example, white cells denote walls. The perimeter is shown for each(if calculated from any starting location that is not a wall (in black)

![world](pix4.png?raw=true "World1")
![world](pix5.png?raw=true "World3")
![world](pix6.png?raw=true "World2")


Here are three example worlds (the output of the `toString()`). Here, `s` denotes the starting location, `g` denotes gold and `#` denotes a wall. The border of the world is also shown but that is NOT a wall.

```
+---+
|s  |
| g |
|   |
+---+

+---+
|s#g|
|###|
|g#g|
+---+

+---+
|s# |
|   |
| # |
+---+
```

The output for the two methods for these three examples should be 

```
example | findGold() | computePerimeter()
  1     |    >0      |        0   
  2     |     0      |        2
  3     |     0      |        6
```

For this problem, I would suggest that you modify the `MyLocation` class (do NOT change the two provided constructors) to add state and potentially behaviour as you see fit. Be sure that you do NOT modify the `World` and `Location` classes though. We will test your code by simply calling the two methods in the `Gold` class with different worlds and starting points.  

# Submission Recap

A complete assignment will consist of a single file `comp1406a5.zip` that has a single folder/directory called `comp1406a5`. The `comp1406a5` folder will have the following two files included:

```java
StudentBST.java
MyLocation.java
Gold.java
```

All classes must be in the `comp1406a5` package. That is, all files must have the `package comp1406a5;` directive as the first line. Your code will NOT compile if it does not have this and you will receive zero correctness marks if your code does not compile.
