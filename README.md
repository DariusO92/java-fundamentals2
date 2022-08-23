# java-fundamentals2

## Lab One
### Feature task
- Pluralize
Write a function called pluralize that accepts a word and a number and returns a string with the word pluralized with an “s” if the number is zero, or greater than one.
- Flipping Coins
Write a function called flipNHeads that accepts an integer n and flips coins until n heads are flipped in a row. Simulate coin flipping by choosing a random number between 0 and 1. Numbers below .5 are considered tails. Numbers at and above .5 are considered heads. Print out heads or tails on one line for each flip. Print It took FLIPS flips to flip N heads in a row. once n heads have been in a row.

- Command Line Clock
Write a method clock that uses Java’s built-in LocalDateTime object to constantly print out the current time to the console, second by second. The program should run until someone manually kills it with CTRL-C or presses the “stop” button in their IDE. Each time should only be printed once. Your program should detect when the seconds increase and only print something out when the timestamp changes.

Zero-pad single digit numbers as strings so the timestamp is always the same number of characters.

## Lab Two

## Lab Three

## Lab Four

## Lab Five

## Lab Six

- Create a class to represent a Restaurant. Each Restaurant should have a name, a number of stars betweeen 0 and 5, and a price category (i.e. number of dollar signs).
Implement a Restaurant constructor.
Test that your Restaurant constructor is behaving reasonably.
Implement a reasonable toString method for Restaurants.
Write a test to create an instance of Restaurant and ensure that its toString is working properly.

- Create a class to represent a Review. Each Review should have a body, an author, and a number of stars.
Write a Review constructor.
Test that your constructor is working reasonably.
Implement a reasonable toString method for Reviews.
Write a test to create an instance of Review and ensure that its toString is working properly.


- A Review should be about a single Restaurant. Choose an implementation for this, and implement it. Some considerations:
Should a Review know which Restaurant it is about?
Should a Restaurant know which Reviews are about it?
Is a Restaurant a special type of Review? Is a Review a special type of Restaurant? Is there common functionality that unites them?
Update your toString and constructor methods appropriately, and also update your testing code to test this new functionality.

- Add an instance method addReview to your Restaurant class. This method should take in a Review instance, and associate that review with this Restaurant. The specific methodology for this will vary, depending on the implementation you chose above.
 Add tests to ensure that when you call addReview, the association is created between the Restaurant and the Review.
 
- When you associate a review with a restaurant, that restaurant’s star rating should change. Ensure that your addReview method updates the Restaurant star rating appropriately, and add tests. (In particular, ensure that if you’re trying to call addReview when the restaurant and the review are already associated, the star rating of the restaurant does not update.)
