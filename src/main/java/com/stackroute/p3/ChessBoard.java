/**
 * Program to create a ChessBoard pattern with the help of multidimensional array, where
 * WW represents white color and BB represents Black color.
 */
package com.stackroute.p3;

public class ChessBoard {

    /*Method to print the chessboard*/
    public Boolean chessBoardMethod(int m,int n) {

        if (m == 8 && n == 8) {
            for (int i = 0; i < 8; i++) {
                System.out.println();
                for (int j = 0; j < 8; j++) {

                    //Checks for the sum is even and prints Ww or BB
                    if (i + j == 0 || (i + j) % 2 == 0) {
                        System.out.print("WW|");
                    } else {
                        System.out.print("BB|");
                    }
                }
            }
            return true;
        }
        else if (m == 0 || n == 0)
            return null;
        else
            return false;
    }
}
