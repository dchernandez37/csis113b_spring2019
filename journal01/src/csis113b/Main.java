/*
 * Student Name
 * Student ID
 * December 30, 2018
 * Journal 01 - program demonstrates use of basic math functions and variable
 * declaration and initialization.
 * */
package csis113b;

public class Main
{
    
    public static void main(String[] args)
    {
        // declare an integer variable
        int firstNumber;
        
        // assign the value 3 to the variable
        firstNumber = 3;
        
        // declare and initialize using var
        var secondNumber = 7;
        
        // declare and initialize a result variable
        var result = firstNumber + secondNumber;

        // declare and initialize a third variable
        var thirdNumber = 11;

        // subtract the third value from the current result
        result -= thirdNumber;
    }
}
