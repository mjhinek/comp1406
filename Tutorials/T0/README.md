# Tutorial 0


## Objectives
Practice using the submission server, compiling Java files, running Java
programs, and basic Java code.


---


## Tutorial Grade

There is no grade for this tutorial. However, it is expected that you will
complete this tutorial. It is essential that you know how to use the submission
server as you will be using it for assignments and the remaining tutorials
in the course. It is also essential that you know how to compile Java source
code and run java programs that are part of a package.

If you **do not** complete this tutorial, the TAs will **not** spend time
in Tutorial 1 helping you with this content. You **MUST** master the contents
of this tutorial as soon as possible so you can move on to the actual course content.

---


__0)__ You will be using a shell to compile and run your java programs. In Windows, run the **cmd.exe** program. In OS X, run the **Terminal** application. When you are using either of these programs, we will say you are using a *command line* or *shell*. From the shell, create a new directory (folder) called **comp1406t0**. The commands are given below.

| **Windows**            | **MAC/Linux**  |
| -------            | ---------- |
| `mkdir comp1406t0` | `mkdir comp1406t0` |


Check that the new folder is there by entering

| **Windows**        | **MAC/Linux**  |
| -------            | ---------- |
| `dir`              | `ls`       |


This will list all files and directories in the current directory that you are in.

Next, download the **HelloWorld.java** file and save in your 
**comp1406t0** folder. To verify that you have successfully saved in your new folder, type 

| **Windows**        | **MAC/Linux**  |
| -------            | ---------- |
| `dir comp1406t0\ ` | `ls comp1406t0/`       |

This lists everything inside the **comp1406t0** directory. You should see **HelloWorld.Java** listed. 

In order compile and run Java programs in this tutorial, you will need to be in the directory that has **comp1406t0** as a sub-directory. (This is exactly where you should be in your shell.)

To compile a java file, HelloWorld.java for example, you will type


| **Windows**        | **MAC/Linux**  |
| -------            | ---------- |
| `javac comp1406t0\HelloWorld.java ` | `javac comp1406t0/HelloWorld.java `       |

If the java file compiled without error, check the **comp1406a0** directory again (using `dir` or `ls` as above) to see the new file called **HelloWorld.class**. This is the java byte-code file for the class.

To run the program in the Java Virtual Machine (JVM), type

| **Windows**        | **MAC/Linux**  |
| -------            | ---------- |
| `java comp1406t0.HelloWorld` | `java comp1406t0.HelloWorld`  |


Take note that when running the program, we don't have a slash in the name (we have a dot instead) and we don't include the **.class** (or **.java**) filename extensions. The command tells Java to run the program *HelloWorld* that is in the package *comp1406t0*. 

This is how we will **compile** and **run** all of our Java code this semester.

__1)__ Make a zip file of your entire **comp1406t0** directory. You can delete your **.class** file if you wish. When submitting code we are only ever interested in your **.java** files. 

Use the default archive/compression program on your machine. 
+ For Windows, right-click on the folder name, chose *send to* and then *compressed (zipped) folder*. Rename your zip file **t0-USERENAME.zip** (where USERNAME is your *cmail* username using all lowercase letters, no dots). 

+ For OS X, right-click on the folder name, chose *compress "comp1406t0"*. Rename your zip file **t0-USERENAME.zip** (where USERNAME is your *cmail* username using all lowercase letters, no dots). 





__2)__ Log on to the submission server for the course.

http://134.117.26.180:9091

In order to access this webpage, you must either be directly connected to the network (i.e., using a computer in the lab) or using a VPN. In order to use a VPN (on a laptop or on your computer at home), you can download the appropriate software for your machine at

https://carleton.ca/its/help-centre/remote-access/

Once you can access the server webpage, you can log on. 
Use your *carleton* email address as your username (use only lowercase letters and include any dots). For example, *alice.zebra@carleton.ca*, for student Alice Zebra. Note that your *cmail* username does not include the dot but your *carleton* email alias needs it.

The password for your account on the server can be found in the *comments* of your *server* grade on *cuLearn*. 

Submit your **t0-USERNAME.zip** file for Tutorial 0. After you submit, you will be put in a queue for grading. Check the status of your submission a few times until you have a grade. If everything went right up to this point, your grade should be 50%. 


__3)__ Modify the **HelloWorld** program as follows.

Add a new method (function) to the class

```java
public static int numberOfEvens(int[] numbers){
  int answer = -1;
  // add more code here
  return answer;
}
```

Add code to the method so that it 

+ returns the number even numbers in the input array. Hint: a number `x` is even if an only if `x % 2` (x mod 2; the remainder when dividing x by 2) is equal to `0`

+ replaces every odd number in the array with the same number multiplied by 2. 

Hint: the Python code for this would look like

```Python
def numberOfEvens(numbers):
  answer = -1
  for position in range(len(numbers)):
    if numbers[position]%2 == 0:
      answer = answer + 1                        ## answer += 1
    else:
      numbers[position] = numbers[position] * 2  ## numbers[position] *= 2
  return answer
```


Test your code. Modify the **main** method to be 

```java
public static void main(String[] args){
   int[] test1 = {1,2,3,4,5};
   System.out.println( "Expected result of numberOfEvens(test1) is 2");
   System.out.println( "Actual result of numberOfEvens(test1) is" + numberOfEvens(test1) );

   System.out.println("-- let's repeat --")

   System.out.println( "Expected result of numberOfEvens*test1) is now 5");
   System.out.println( "Actual result of numberOfEvens(test1) is now" + numberOfEvens(test1) );
 
}
```

Make a new zip file **t0-USERNAME.zip** following the steps outlined in Question 1 with your new **HelloWorld** class. Submit your code to the server. If your **numberOfEvens()** method is correct, your grade should now be 100%.

Once you have achieved 100% on the server you have finished the tutorial. Tutorials may have additional optional questions at the end that are more challenging. If you finish the tutorial very quickly, you should try the optional questions. The TAs will be available in tutorial to help with any questions you might have.

---

__4)__ [OPTIONAL] Start Tutorial 1.

