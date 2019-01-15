/**
 * Program that will generate ​ exceptions​ of type NegativeArraySizeException,
 * IndexOutOfBoundsException, NullPointerException. Record the catching of each exception by
 * displaying the message stored in the exception object.
 */
package com.stackroute.p3;

public class TypesOfExceptions {
    public int number;

    /*Method that shows the working of Exceptions*/
    public static void main(String[] args) {

        //try-catch block for NegativeArraySizeException
            try {
                int array[] = new int[-1];
            }catch (NegativeArraySizeException e) {
                System.out.println(e);
            }

        //try-catch block for IndexOutOfBoundException
            try {
                int array1[] = new int[10];
                System.out.println(array1[10]);
            }catch (IndexOutOfBoundsException e) {
                System.out.println(e);
            }

        //try-catch block for NullPointerException
            try{
                TypesOfExceptions object= new TypesOfExceptions();
                object = null;
                object.number=10;
            }catch (NullPointerException e) {
                System.out.println(e);
            }

    }
}
