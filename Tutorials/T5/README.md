# Tutorial 5
---

## Objectives  
Practice with Binary Trees and using Exceptions 


## Submit

Submit a zip file with your `comp1406t5` folder and your `StudentTree` and `TestLL` classes. 

---


# 1. Binary Trees 

Complete the two `find()` methods and the `add()` method in the `StudentTree` class. The a student tree object is a binary tree that stores students. 

The `add()` method should be randomized. For example, starting from an empty tree and adding two students (student 1 first, then student 2), the resulting tree should look like

```
student 1
     \
   student 2
```

50% of the time, and look like 

```
    student 1
     /
student 2 
```

50% of the time.

Do not change any other method in the class

---

# 2. File I/O and Exceptions 

The `ReadFile` class opens and reads a text file.  The `WriteFile` class opens and writes to a file. Compile and run these programs.

There are several ways to read/write text files. The examples shown here are just one way of achieving this.

Look at the API for the `BufferedReader` class. The `readline()` method is a simple way to read the text file line by line. It returns `null` when the end of the file has been reached.

[https://docs.oracle.com/javase/8/docs/api/java/io/BufferedReader.html](https://docs.oracle.com/javase/8/docs/api/java/io/BufferedReader.html)

Look at the API for the `PrintWriter` class. Notice that we can print to a file just like we print to the terminal. There are overloaded `print()` and `println()` methods that print with or without adding a newline.

[https://docs.oracle.com/javase/8/docs/api/java/io/PrintWriter.html](https://docs.oracle.com/javase/8/docs/api/java/io/PrintWriter.html)

Using the `ReadFile` and `WriteFile` classes as a starting point, write a program that reads all the contents of a file (the provided text.txt, for example) and finds the 10 most frequently used words.

Your program will read every line in the input file and record each _word_ in the line. A word is a sequence of consecutive non-whitespace characters.

Note that the `split()` method in the `String` class will break up a string into words.

```java
 String s = "the cat in the 	hat   .";
 String[] words = s.split("\\s+");
```

Here, the input `"\\s+"` tell `split()` to split the string `s` by whitespace characters.

Use a dictionary (`HashMap`) to store the words. The keys should be your words and the values should be the frequency count. Each time you see a word that you have already seen, you will need to update the value for that work (that key).

How do you use a HashMap? The API gives you lots of information!

[https://docs.oracle.com/javase/8/docs/api/java/util/Hashtable.html](https://docs.oracle.com/javase/8/docs/api/java/util/Hashtable.html)

Once you have built your dictionary, you will need to extract all the key value pairs. You can, for example, use the `keySet()` method to obtain a set (use a `Set` for this; if you try to use `HashSet` you'll run into problems) of all the keys in the dictionary. You can then use this set to build list (`ArrayList`) of key-value pairs. You can use the helper class `KeyValue` for this if you wish. You can then sort the list using `Collections.sort()` since KeyValue implements comparable.

Once you have sorted the list, you write the last 10 (the 10 with the highest frequency) to a file called `"best10.txt"`.

Note: Java provided a `Map.Entry` interface to help do this same thing (in place of the `KeyValue` class). Feel free to use this other approach for this problem.

---

3. Extra 

Notice that "cat.", "cat,", "cat!" and "cat" will all appear as different words in your dictionary instead of one "cat" (which should be the case). Modify your code from the previous problem to strip trailing punctuation from all the words before you add them to the dictionary. You should remove things like ",", ";", "!", "\'", "?", etc.


There are situations where more than 10 words should be saved. For example, consider a file with 9 unique words that are the 9 most frequent and then there is 5 words with the 10th largest frequency. All 5 words should be included in the saved file. Modify your code so that all words with the 10 highest frequencies will be saved to the output file.


