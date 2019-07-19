# Assignment 2
## Due  <span style="color:red">Wednesday, July 24th</span> at <span style="color:red">5:30pm</span>



---

Submit a single file called `assignment2.zip` to the submission server

http://134.117.31.149:9091/

Your zip file must contain a directory called `comp1406a2` and all of your  `.java` files must be in this directory. Do not include your `.class` files.

---

Do **not** import or use any classes other than ones provided in the `java.lang` package or specified in the assignment. You can use `String`, `Object`, any primitive Wrapper classes (`Integer`, `Double`, etc.)

---

This assignment has 100 marks. Submissions made by the due date will be graded out of 100. Assignments submitted after the deadline but before midnight of July 26th will be graded out of 115. Submissions after after midnight of July 26th will not be recorded (although the server will still accept and test your code).

---

In this assignment,  **you will need to add attributes** (state) to your `Temperature`, `Lock` and `Box` classes. You may add any attributes that you see fit. You may also add any helper method that you need. Just keep in mind that we can only test your code by calling the methods in specified in the classes you need to complete (So your helper methods need to be called from these).  

---

# 1. Temperature [25 marks]

Complete the provided `Temperature` class. Add
any attributes and helper methods as needed but keep in mind that testing will involve only the methods you are asked to write/complete.  You must complete the constructors and methods in the provided class (without changing any signatures, return types, or modifiers).

In this problem you will need to be able to convert temperatures between Celsius, Fahrenheit and Kelvin. For help, see

{https://en.wikipedia.org/wiki/Conversion_of_units_of_temperature}


A temperature object holds a single temperature and displays it in one of the three scales. Once a scale has been set, it will display the temperature in that scale until changed. The default scale is Celsius if not specified.

The three scales are represented by an **Enum** class (`Scale.java`). For this assignment, the purpose of the enum class is to provide a consistent naming scheme for the different scales. Essentially, we assign fixed names for the three scales and use these everywhere in the code much like we would if we declared static final strings in our class. The compiler checks if the names are right. If we used Strings instead, if you spelled the scale incorrectly (easy to do with these words), you would fail all the auto-testing.   

How do you use an enum? They are simple to use. You do not create them with `new` and you do not need to use `.equals` to compare them. You just use them as place-holders for the value we want.  

```java
Scale s = Scale.CELCIUS;       // a variable of an enum type
Temperature t1 = new Temperature(33.1, s);
Temperature t2 = new Temperature(87.2, Scale.FAHRENHEIT);
boolean b = Scale.CELCIUS == s;   // will be true! can compare with ==
```

For one of the constructors, you are allowed to pass a string to specify the scale. It should allow for some flexibility in the input. For example, `"FAHRENHEIT"`, `"Fahr"`, `"f"` and `"FaHReNHeI"` should be all accepted and interpreted as Fahrenheit.

Some examples of using a `Temperature` object:

```java
Temperature t = new Temperature(10.1);
System.out.println(t.getScale());    // outputs Scale.CELSIUS.toString()
System.out.println(t);               // outputs 10.1C
t.setScale(Scale.FAHRENHEIT);        // change scale
System.out.println(t);               // outputs 50.18F
System.out.println(t.getScale());    // outputs Scale.FAHREHEIT.toString()
t = new Temperature(12.25, "Kel");   // must recognize short form
System.out.println(t);               // outputs 12.25K
```

When you set a temperature (without explicitly stating the scale), it is assumed that the input temperature is in whatever scale the object is currently using.

Note: You should have **no** static attributes or methods in your class (unless they were supplied in the starter code; or unless you have a `main` method for your own testing).


# 2. Boxes and Locks and Keys and Secrets


In this problem, you will complete several classes involving boxes, locks, keys and secrets. Follow the specifications in the starter files for the classes. You can run the javadoc program to generate the API (see Tutorial 2) for the classes.

A box has a secret inside it (and maybe a key!) and can be locked. In order to open a box, you need the right key to unlock the lock. Secrets.java  will be a program that takes an array of boxes and an array of keys and tries to open as many boxes as it can with those keys to find as many secrets as possible and returns the Proofs that if found them. Remember, a box can also __contain__ a key to another box!

You need to complete the following classes: `Lock`, `Box`, and `Secrets`. You must submit these files.

The following classes are provided: `Key`, `Proof` and `Secret`. Do **not** change these classes. We will delete these files if you submit them and use our own copies.


# Submission Recap

A complete assignment will consist of a single file `assignment2.zip` that has a single folder/directory called `comp1406a2`. The `comp1406a2` folder will have the following three files included:

```java
   Temperature.java
   Lock.java
   Box.java
   Secrets.java
```

All files must have the `package comp1406a2;` directive as the first line. Your code will **not** compile if it does not have this and you will receive zero marks if your code does not compile.
