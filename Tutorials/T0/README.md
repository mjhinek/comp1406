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
| `mkdir comp1406t0` | `mkdir comp1406t1` |


Check that the new folder is there by entering

| Windows            | MAC/Linux  |
| -------            | ---------- |
| `dir` | `ls` |


This will list all files and directories in the current directory that you are in.

Download/copy all the java files for this tutorial into this new directory. To see that they are there, type

```dir comp1406a0\```

This lists everything inside the **comp1406a0** directory.

In order compile and run the java programs in this tutorial, you will need to be in the directory that has **comp1406a0** as a sub-directory.

To compile a java file, Tutorial.java for example, you will type

```javac comp1406a0\Tutorial01.java```

If the java file compiled without error, check the **comp1406a0** directory again to find a new file called **Tutorial01.class**. This is the java byte code file for the class.

Now, to run the program in the Java Virtual Machine (JVM), type

```java comp1406a0.Tutorial01```

Take note that when running the program, we don't have a slash in the name (we have a dot instead) and we don't include the **.class** or **.java** filename extensions.

This is how we will **compile** and **run** all of our Java code this semester.

Now that you know how to compile a Java file, compile and run the **SampleJavaCodeProgram** program. The program will not initially compile. Read the error message and fix the mistake in the code in order to make it compile and run. (Do not spend too much time on fixing it. Google is your friend when you run into compile errors. Check what the error means and see how to fix it. Get help from a TA if you cannot fix this relatively quickly.)

