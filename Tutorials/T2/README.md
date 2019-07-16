# Tutorial 2
---

## Objectives  
Practice creating and using constructors. Generate random numbers.

## Submit

Submit a zip file with your `comp1406t2` folder and your `Money` and `Coin` classes.


## Play Computer [10 minutes]  

Trace the following code. Show the values of `i`, `j`, and `sum` at every stage in the code (before the loop starts, during the iterations of the loop, and after the loop terminates.


```java
String[] words = {"cat", "wolf", "elk", "elephant", "sparrow"};
int sum = 0;
for(int i=0; i<12; i+=1){
  int j = i % words.length;
  if( words[j].length > 3 ){
    sum = sum + 5;
    i = i + 2;
  }else{
    sum = sum + 2;
    i = i + 1;
  }
  if( i%3 == 1 ){
    i = i + 2;
  }
}
```


## Constructors
Modify the `Money` class that is provided. This is a simple class that stores money as dollars and cents. For example, $12.73 will be stored as 12 dollars and 73 cents.  The cents value stored should never be greater than 99, so 3 dollars and 164 cents should actually be stored as 4 dollars and 64 cents.    

Do not alter the attributes.

The class has only one method, `getMoney()`, which returns a String representation of the money object. Your first task is to create three constructors for the class as follows:

```java
public Money(){...}
   // creates a Money object with zero money $0.00

public Money(int dollars, int cents){...}
   // creates a Money object with total value as specified by
   // the input values. Input values are assumed to satisfy
   // dollars >= 0 and cents >= 0.

public Money(int cents){...}
   // creates a Money object with value as specified by
   // the input cents. Input value is assumed to satisfy
   // cents >= 0
```

The `Money` class has a `getMoney()` method to help test/debug your code. It returns a String representation of the money.

Use the testing program `TestMoney.java` to help test your constructors.

Next, add the following _instance methods_ to your `Money` class:

```java
public void add(int c){...}
 // adds c cents to the current value

public void add(int d, int c){...}
 // adds d dollars and c cents to the current value

public int remove(int c){...}
 // removes c cents from current value if current
 // value is large enough. Otherwise, removes as much as it can.
 // Returns the actual amount of cents removed (may be > 100)
```

Be sure to test your methods. Pay special attention to the `remove` method. As with the constructors, the intention is that your internal representation of the money will satisfy the condition `0 <= cents <= 99` at all times. Adjust your dollars and cents so that this is always maintained.


## Flipping a coin


Complete the class called `Coin`. A coin (each Coin object) can either be fair or unfair. A fair coin is unbiased and when you flip it will land on heads or tails with equal probability (50%). An unfair coin is biased (it lands on heads wins some probability `p` and tails with probability `1-p`).

The coin class has two `class attributes`

```java
public static final String HEADS = "Heads";
public static final String TAILS = "Tails;"
```
Do NOT change these in anyway. You should use these when referring to heads and tails.

The `Coin` class has two constructors

```java
public Coin()           // create a fair Coin
public Coin(double p)   // create an unfair Coin
```

The first constructor is used to create fair coins. The second constructor creates a coin that when flipped will be heads with probability `p` and tails with probability `1-p`. Note: the second constructor can also be used to create a fair coin by passing 0.5 as input.

You are free to add any more _instance attributes_ as you need. Be sure they are all _private_.

The `Coin` class has the following instance method

```java
public String flip()
```

that outputs either `HEADS` (with probability `p`) or `TAILS` (with probability `1-p`). This method should only return one of the two static (class) attributes.

The `Coin` class has the following instance method

```java
public int  numberOfFlips()
```

that simply returns how many times this given coin (Coin object) has been flipped.

The `Coin` class has the following instance method

```java
public String[] history()
```

which returns a list (array) of the past 10 flips (or less if there haven't been 10 flips yet). The order of the output array should correspond to the order that the flips occurred (in reverse order). The first String should be the _last_ flip. You **must** use an array for this. Do **NOT** use `ArrayList` or any other Java container classes to store the history state. Hint: You will need to have an attribute to keep track of the history. Read the _Extra Help_ section below for help with this.

The `Coin` class **must** involve a `java.util.Random` object to generate the coin flips. (See the _Extra Help_ section below for more information about this.)


---

# Extra Help


## Basic (Pseudo) Randomness

Programs often need some "randomization".  We will consider two ways to easily generate a pseudorandom number. A pseudorandom sequence of numbers looks like a random sequence of numbers but it is actually computed using a deterministic algorithm.  For our purposes, we can consider it as good enough to be random.  


### Math.random()

`Math.random()` will return a pseudorandom double, call it X, that satisfies `0.0 <= X < 1.0`.

Using the output of this static method, we can simulate die rolls, coin flips, etc.

For example, to simulate the roll of a 6-sided die, we can generate random integers in the range [1,6] using

`1 + (int) (Math.random()*6)`

Why does this never generate 7? The `Math.random()*6` will generate a random number, call it X, that satisfies `0.0 <= X < 6.0`. When we cast this to an integer, Java simply throws away the decimal part, so we only get the integers 0,1,2,3,4 and 5. The final output, based on the value of X will be

```
0.0 <= X < 1.0 --> 1
1.0 <= X < 2.0 --> 2
2.0 <= X < 3.0 --> 3
3.0 <= X < 4.0 --> 4
4.0 <= X < 5.0 --> 5
5.0 <= X < 6.0 --> 6
```

### The Random Class

The `java.util.Random` class provides methods for generating random sequences (integers, floating point numbers, booleans). Unlike the Math class, you will need to create an instance of the Random class (i.e., create an object of type Random) to use it.  The methods in the class are _not_ static.

To simulate the roll of a die (an integer in the range [1,6]) we would use

```
java.util.Random die = new Random();
int die_roll = 1 + die.nextInt(6);
```

See the API for the class to see what other methods the class provides.
[https://docs.oracle.com/javase/8/docs/api/java/util/Random.html](https://docs.oracle.com/javase/8/docs/api/java/util/Random.html)


## History

How do we remember the last 10 flips in order. We could create a new data structure (class) to deal with this nicely. In fact, we may do that later in the semester. For now, we'll use a simple fixed size array.

Suppose we allocate memory for an array of Strings to hold 10 Strings. The tables shown below show index value (top) and array contents (bottom)

Initially we have

|0|1|2|3|4|5|6|7|8|9|
|-|-|-|-|-|-|-|-|-|-|
|null|null|null|null|null|null|null|null|null|null|

Let's have an integer variable, call is `position` to keep track of the _next_ place in the array where we will store a head/tail. Initially, it is set to 9 (the back of the array). `int position = array.length-1`.

Suppose the first flip is tails.  We put a tails in the array at index `position` and then decrement position (`position = position -1;`). If the next flip is heads, we have

|0|1|2|3|4|5|6|7|8|9|
|-|-|-|-|-|-|-|-|-|-|
|null|null|null|null|null|null|null|null|Heads|Tails|

with position being 7.

Suppose we ask for the history. We can iterate through the array (in a forward direction) starting in `position+1`. Our `numberOfFlips()` method will tell us how many times to iterate (either 10 or less). In this case, we have 2 iterations.

This is fairly straightforward until we have done 10 or more flips. Just after the 10th flip, `position` should be equal to `-1`, which is not a valid index position. To avoid any array index out of bounds errors, we will wrap the array around to the back of itself be letting `position` be equal to `array.length-1`. We then continue adding flips from the back overwriting any flip that was already recorded (which is OK since it would be further in the past than 10 flips). So whenever we decrement `position`, we just need to remember to wrap around to the back when we go past the front. This is a simple check when we perform the decrement.

Whenever we want to get the history, in general, we always start with `position  +1` and then iterate the needed number of times (in a forward direction). If at any time an index position is equal to (or greater than) the length of the array we wrap it around to the front of the array.

Suppose we have the following 10 flips: T, H, H, H. H, H,T, T, T, T. The array will be

|0|1|2|3|4|5|6|7|8|9|
|-|-|-|-|-|-|-|-|-|-|
|Tails|Tails|Tails|Tails|Heads|Heads|Heads|Heads|Heads|Tails|

and `position` will be 9 (it would have been -1 but we checked and made it equal to `array.length-1`).

How would be get the history? We start from index position `position+1`. This is too big so we wrap to the front and start with index 0 (we replace `position` with `position % array.length`) and iterate 10 times.

If we flip a heads after this, we have


|0|1|2|3|4|5|6|7|8|9|
|-|-|-|-|-|-|-|-|-|-|
|Tails|Tails|Tails|Tails|Heads|Heads|Heads|Heads|Heads|Heads|

and `position` is 8.

This is an example of a **circular array**.

# Javadocs

The `Coin` class has a good number of comments in it. The comments might seem
a bit unusual at first. They are special comments that the javadoc tool uses to
generate the nice HTML APIs that you see when you look at Java's documentation
online. For example, see the `String` classes API at {https://docs.oracle.com/javase/8/docs/api/java/lang/String.html}.

In order to generate the API files, from the same working directory where you
compile and run your tutorial code, type

```
javadoc -d comp1406t2\docs comp1406t2\Coin.java -author -version
```

This will create a new folder called `docs` in the `comp1406t2` folder.
Inside the `docs` folder is an `index.html` file. If you click on this file
it will open in a web browser. You can now see the `Coin` class's API.
