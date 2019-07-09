# Tutorial 1


## Objectives
Basic Java programming: control flow, arrays, input/output, using objects.

---


## Tutorial Grade

Grades for tutorials are determined by a teaching assistant (TA) in the course.
You must submit your tutorial material to the submission
server (http://bit.ly/COMP1406S19) and you must **present** your submission
to a TA no later than one week after the start of your tutorial (i.e., 7 days
from the *start* of *your* tutorial). You may present during any tutorial or
office hours with the TA. You may present before your tutorial starts if you wish.

Your tutorial grade for a given tutorial will be one of 0, 1 or 2. This will be based on the
discretion of the TA when you present your code and are asked questions about it.

---

Please check your grades of your tutorials on your cuLearn tutorial page
to be sure your marks are as expected. We will not be changing marks after
two weeks from a given tutorial.

---

It is assumed that you have already read the **SampleJavaCodeProgram.java** file.

__0)__ Create a directory called **comp1406t1** and save all Java source code files for this tutorial in this new directory.

__1)__ Compile and run the **SampleJavaCodeProgram** program. The program will not initially compile. Read the error message and fix the mistake in the code in order to make it compile and run. (Do not spend too much time on fixing it. Google is your friend when you run into compile errors. Check what the error means and see how to fix it. Get help from a TA if you cannot fix this relatively quickly.)

__2)__ Complete the **findString()** method in the **Find.java** file. The method takes a string (target) and an array of Strings (data) as input.

```java
public static int[] findString(String target, String[] data)
```

The method outputs a new array that contains all index positions in the 
input `data` array where the input `target` string appears.

For example, given

```java
String[] animals = {"cat", "dog", "cat", "eel"};
int[]    output1 = Find.findString("cat", animals);
int[]    output2 = Find.findString("owl", animals);
```
the `output1` array should be `[0,2]` and the `output2` array should be `[]` (the empty array).

__3)__ Modify the provided **PrintQs.java** program. The program currently asks the user to enter an integer (call it the number N).  You will modify the program so that it will draw an NxN grid of Qs. For example, if you enter 7, the program will output

```
QQQQQQQ
QQQQQQQ
QQQQQQQ
QQQQQQQ
QQQQQQQ
QQQQQQQ
QQQQQQQ
```

There are 7 lines printed and each line has 7 Q's printed (without spaces).

Running the program with the value 2 will output

```
QQ
QQ
```

Next, modify your code so that your program displays 4 triangles based on the input N. For example, if the command line argument was 4, then the output should be
```
Q
QQ
QQQ
QQQQ

QQQQ
QQQ
QQ
Q

QQQQ
_QQQ
__QQ
___Q

___Q
__QQ
_QQQ
QQQQ
```

The output, in this case, has 19 lines (16 lines with Qs and 3 blank lines between the triangles). Each underscore `_` represents a space (use a space not underscore in your code). There should be no extra characters (like spaces) after the last Q in each line.


__4)__ Create a public Java class called \code{OldMath} with a static method that computes square roots using the _Babylonian method_. 

https://en.wikipedia.org/wiki/Methods_of_computing_square_roots#Babylonian_method

The method should be called

```java
public static double sqrtBabyl(double number)
```

It is an iterative method that keeps making better and better approximations to the square root of a number. The
algorithm is terminated when the improvement in successive approximations becomes small.
Our version of the Babylonian method to find the square root of a number N is as follows:
1. Let M1 := N/2 be our first guess
2. Let M2 := average of M1 and N/M1
3. If |M1-M2| < epsilon then stop and output M2
4. Otherwise, Let M1 := M2 and go back to step 2

Here, |x| is the absolute value of x and epsilon is a small positive number (like 0.0001). We use := to denote assignment above.

Your program should prompt the user to enter the the values of N and epsilon. The program should then call your method that prints out all approximations (the value of M2) of the square root of N until is reaches the desired accuracy. When you get the return value you should compare it to the value computed using the square root method given in the **Math** class. You can do other computations (like computing the absolute value) with methods from Math.

https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html

Your class should have a static attribute (class state) 

```java
public static double epsilon = 0.000001;
```

Your program may change this value in the main method (after receiving the desired user input) but should use this default value otherwise. You can simply access `epsilon` inside your `sqrtBabyl()` method directly.
