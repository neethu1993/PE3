/**
 * Program to find out if a series of 7 digits are consecutive numbers. To make this easier,
 * assume the digits are a ​string​ and use split()
 */
package com.stackroute.p3;

import java.util.Arrays;

public class ConsecutiveSeries {

    /*Method to find the numbers are consecutive in nature*/
    public Boolean consecutiveSeriesMethod(String numbers) {
        String[] words = numbers.split(",");
        int number[] = new int[words.length];
        int i=0;
        Boolean flag = true;

        //Converts the string of words to integer format
        for(String n: words){
            number[i++] = Integer.parseInt(n);
        }
        Arrays.sort(number);
        for (int j=0;j<words.length-1;j++) {
            if(!((number[j+1]-number[j]) == 1)) {
                flag = false;
            }
        }
        return flag;
    }
}
