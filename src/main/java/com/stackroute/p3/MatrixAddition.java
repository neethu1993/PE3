/**
 * Program to compute the addition of two matrix, Read the number of rows and columns
 * as input, also the values of each matrix
 */
package com.stackroute.p3;

public class MatrixAddition {

    /*Method to perform matrix addition*/
    public Boolean matrixAddition(int m,int n,int x,int y,int[][] first,int[][] second) {

        //Checks the order of both matrices are same or not
        if(m==x && n==y) {
            if (first == null || second == null) {
                return false;
            } else {

                //Matrix addition performs here
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.print(first[i][j] + second[i][j] + " ");
                    }
                    System.out.println();
                }
                return true;
            }
        }
        else {
            return false;
        }
    }
}
