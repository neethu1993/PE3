/**
 *Create a class with a main( ) that throws an object of class Exception inside a try block.
 *a. Give the constructor for Exception a ​ String​ argument.
 *b. Catch the exception inside a catch clause and print the ​ String​ argument.
 *c. Add a finally clause and print a message to prove you were there.
 */
package com.stackroute.p3;

public class TryCatchFinally {
    /*Method for custom exception that throw exception*/
    public static void customException() throws Exception {
        throw new Exception("Exception Thrown");
    }
}
