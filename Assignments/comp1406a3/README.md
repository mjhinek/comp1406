# Assignment 3
## Due  <span style="color:red">Wednesday, July 31th</span> at <span style="color:red">5:30pm</span>



---

Submit a single file called `assignment3.zip` to the submission server

http://134.117.26.180:9091

Your zip file must contain a directory called `comp1406a3` and all of your  `.java` files must be in this directory. Do not include your `.class` files.

---

Do **not** import or use any classes other than ones provided in the `java.lang` package or specified in the assignment. You can use `String`, `Object`, any primitive Wrapper classes (`Integer`, `Double`, etc.)

---

This assignment has 100 marks. Submissions made by the due date will be graded out of 100. Assignments submitted after the deadline but before midnight of August 2nd will be graded out of 115. Submissions after after midnight of August 2nd will not be recorded (although the server will still accept and test your code).

---


---

# 1. Comparing Cards


A standard deck of playing cards consists of 52 cards.  Each card has a rank (2, 3,... , 9, 10, Jack, Queen, King, or Ace) and a suit (spades, hearts, clubs, or diamonds).

The ordering of the cards in a standard deck (as defined for this assignment) is first specified by the suit and then by rank if the suits are the same.  The suits and ranks are ordered as follows:

```
diamonds < clubs < hearts < spades
```

```
2 < 3 < 4 < 5 < 6 < 7 < 8 < 9 < 10 < Jack < Queen < King < Ace
```

A _Joker_ card is a special card that is _greater_ than any other card in the deck (any two jokers are equal to each other).
A joker has no suit or rank. For this assignment we will use `Suit.JOKER` to denote the joker (differentiate from other cards). When creating a joker, any valid rank can be passed as input to the constructor (`Suit.JOKER` must be passed as the suit).

Again, the overall ordering for non-joker cards is specified by suit first and then rank; for example, all club cards are _less than_ all heart cards. Two cards with the same rank and suit are considered equal.

Your `Card` class must implement the `Comparable` interface. Cards are compared as described above for the ordering of cards.

Example: The following code
```java
Card c1 = new Card(Rank.THREE, Suit.CLUBS);
Card c1 = new Card(Rank.JACK, Suit.DIAMONDS);
System.out.println( c1.getRank() );
System.out.println( c2.getRankValue() );
System.out.println( c2 );
```
will output
```java
THREE
11
JACK:DIAMONDS
```

and
```java
System.out.println( c1.compareTo(c2) );
```
will output any _positive_ integer, since the 3 of Clubs is _greater than_ the Jack of Diamonds.

If you have an array of many cards, `java.util.Arrays.sort(your_array_of_Card)` will sort it based on the ordering of cards (above). While testing your code, generate an entire deck of cards (plus a joker or two) in random order and then sort it using this method.

# 2. Taxes

In this problem, you will create two concrete subclasses of the provided `Taxes` class. These subclasses will
compute taxes owed (in the `taxesOwed()` method) in different ways. Note that this is not how actual taxes are determined in Canada. You will create a `BasicTaxes` class and a `ComplicatedStudentTaxes` class.

The `BasicTaxes` class must have a constructor

```java
public BasicTaxes(String name, int sin, double income, double deductions)
```

The tax return computed for this class should follow

- 30% of income less deductions. That is, 30% of (income -  deductions).

The `ComplicatedStudentTaxes` class must have the following constructor

```java
 public ComplicatedStudentTaxes(String name, int sin, double income, double deductions, double tuition)
```

A student's (complicated) taxes are determined by the following rules.

- 50% of all income in excess of $100,000. Example, if income is 123,000 then 50% of $23,000.
- **Plus**, 35% of remaining untaxed income less deductions. Using above example, $(123,000-23,000) = 100,000 is untaxed income. If deductions is $25,000 then 35% of $(100,000-25,000) = $75,000.
- **Minus**, 10% of tuition costs.


**Note:** the money values passed as input to the `taxesOwed()` method are floating point numbers (`double`). The output is an integer (`long`). All computations in the method should use floating point numbers. The _final_ result should then be rounded to the nearest integer. Do not round any values while doing your computations.

Note: Taxes could be negative (which would be a return).

---

# Submission Recap

A complete assignment will consist of a single file `comp1406a3.zip` that has a single folder/directory called `comp1406a3`. The `comp1406a3` folder will have the following three files included:

```java
Card.java
BasicTaxes.java
ComplicatedStudentTaxes.java
```

All classes must be in the `comp1406a3` package. That is, all files must have the `package comp1406a2;` directive as the first line. Your code will NOT compile if it does not have this and you will receive zero correctness marks if your code does not compile.
