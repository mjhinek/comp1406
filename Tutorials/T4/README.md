# Tutorial 4
---

## Objectives  
Practice with Linked Lists, the Java Collections Framework and Exceptions.

## Submit

Submit a zip file with your `comp1406t4` folder and your `LList` and `TestLL` classes. For full marks, you must complete Problem 1 (Liked Lists) and Problem 2 (ArryList part). I recommend you try and complete the rest. It will be expected that you can use set, maps and lists (from the JCF). 


---


# 1. Linked Lists 

Recall that a _list_ is a collection of ordered data `x_0, x_1, x_2, ..., x_n-1`. Here, the length of the list is n.

Download the `Node`, `LList` and `OutOfBoundsException` classes. Notice how the `add` method in `LList` throws an exception. Your task is to complete the `LList` class by completing the following methods as described below and throwing an `OutOfBoundsException` whenever appropriate. Note that our `LList` is hard-coded to store strings. 

1. implement the `find(String s)` method: returns first k such that `x_k = s`, return -1 if s is not in the list
2. implement the `set(int k, String s)` method: sets x_k to be s.
3. implement the `compareTo()` method: lists are compared by their lengths. A longer list is _greater_ than a shorter list. Two lists are _equal_ if their lengths are the same. It does _not_ matter what is in the list.


Download and modify the `TestLL` program so that it compiles and runs. Add some tests for the `find()`, `set()` and `compareTo()` methods.


---

# 2. Java Collections Framework (JCF)

All of the classes in the Java Collections Framework (JCF) use generics. As we saw with the `Comparable` interface, one purpose of this is that it lets us specify which type of objects we are dealing with (we can think of the class as having a parameter that specifies a type inside it). Note that when using generics we can only use reference data types. Java does not allow us to use primitive data types with generics (and this is one very good reason we have the primitive wrapper classes). We will cover generics in more detail in class later.



## ArrayList
The `ArrayList` is a commonly used class in the the JCF. It implements the list abstract data type (ADT).   

[https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html](https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html)

Open up a web browser and see what methods the ArrayList class provides. In particular, look at `add(E e)`, `add(int index, E e)`,
`get(int index)`, `remove(int index)`, `set(int index, E e)`, and `size()`. Note, `E` is the type you specify when creating the ArrayList (as follows):




```Java
import java.util.ArrayList;

...

/* empty string list (E is String here) */
ArrayList<String> slist = new ArrayList<String>();

/* empty integer list (E is Integer here) */
ArrayList<Integer> ilist = new ArrayList<Integer>();

```

1. Modify your `TestLL` program so that for each linked list in the program you have a mirror list that is an ArrayList. Use the same operations (when applicable) to create the ArrayLists.

2. Create a `same()` method to take an `LList` and an `ArrayList<String>` that checks if two lists are the same (the lists have the same strings in the same order). That is, create an `LList` and a shadow `ArrayList` and check that they are the same lists using this `same()` method. Note: this is more similar to what a better version of `compareTo()` would have done. 






---

## HashSet

The `HashSet` class in the JCF implements the Set ADT. A set is an unordered collection of unique items. Important methods include `add`, `contains`, `remove`, `isEmpty` and `size`.


[https://docs.oracle.com/javase/8/docs/api/java/util/HashSet.html](https://docs.oracle.com/javase/8/docs/api/java/util/HashSet.html)

```Java
import jave.util.HashSet;
...
HashSet<String> set = new HashSet<String>();
```

Run the `SetORList` program. Rerun the program several times with different values of `size` (see the main method). Try using size values of 1000, 10000, 20000, 50000, etc. Note that the program uses command line arguments. 

What can we say about using an ArrayList and using a HashSet?

Extra: modify `SetORList` to generate a collection of 10 items (Integers for example). Sort the ArrayList (using Collections.sort). How do you sort the data in the set? You 


## Map
The `Map` class implements the Dictionary ADT. It stores <key,value> pairs and so you will see it has two generic parameters.

[https://docs.oracle.com/javase/8/docs/api/java/util/Map.html](https://docs.oracle.com/javase/8/docs/api/java/util/Map.html)

```Java
import java.util.Map;
...
Map<String, String> dictionary = new Map<String, String>();

dictionary.put("cat", "small cute mammal");
dictionary.put("dog", "small mammal slightly less cute than cat");
````

Write a Java method `randomNumbers(int size, int range)` in the `RandomNumbers` class that returns an ArrayList of exactly size unique numbers in between 0 and range (inclusive). The numbers should be generated randomly. Note that a precondition for this method is `range > size`.

Your method should create a Map using using key:values pairs that are `Integer:Integer`.  Each time you generate a random integer (use the `Random` class), you should check if that number is a key in the Map. If it is, increment its value in the Map. Do not add this number to your arraylist to return. If the number is not in the Map, add it to the Map with value 1 and add the number to the arraylist to return.

Once your arraylist has size numbers in it, you can return it. When you return the arraylist, what information does the Map store? Print out the map before you exit your method and see what is there.



---
---

# Extra

Write a static method that takes two `LList<String>` objects that are each already sorted in alphabetical order, and returns a new `LList` that contains all elements of the two input lists in alphabetical order. For example, if `L1 = [A]->[D]->[G]` and `L2=[B]->[C]->[H]->[W]`, then the output will be `[A]->[B]->[C]->[D]->[G]->[H]->[W]`.  

# Extra Extra

Use a Map to find the frequency distribution of words in a body of text (a large string). You can use a Scanner object to break the big string up into individual words (tokens). Find the 10 most frequent words in the text.
