# Hit-OR-Miss-Game-
This game is like battleship game. You enter a location which is represented by an array index, if it is a correct location it will display "hit", if not it will display "miss". At the end  you should have three hits, it will display number of guesses once you reach 3 hits and kill the ship. 


There are two classes: 
1. Hit or miss class
2. Hit or miss test class

Hit or miss class --> 

Instance variables: public int number of hits and private int number of guesses of the user and a private int array for location of the battleship.

There are 2 methods in this class as described below.

Method 1: setLocationCells
Inputs: an int array for the location of the ship. 

It will take input the locations (from the test drive) where the battleship is to be placed. Those locations/indexes would be set to 1. 

Method 2: sunkOrNot

Inputs: Guess from the user in the form of string.

This method will first convert the string into integer. It will then increment the number of guesses. It will then check if the index is valid or not, if invalid it will ask the user to try again, else it will check if the battleship is present at that location or not. 
Checking the battleship: 

It will check if the current indexs value is set to 1 or not
   If it is 1, then it will increment number of hits and set that index value to 0. It will then check if the number of hits equals 3 or not, if it does it will display that its killed and also the number of guesses. If it is not equal to three it will display hit. 
   If it is 0, it will display miss.
   
  
Hit or miss test class -->

A new object of hit and miss class is declared and then the functions are performed. Locations array is declared and used to set the locations. If the number of hits is not equal to three it will continue asking the user to enter the guess. If it is equal to three, it will stop the program and display the number of guesses. 
  

