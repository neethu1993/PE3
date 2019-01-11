/**
 * Program to set up an array of places, Loop round and remove the vowels.
 */
package com.stackroute.p3;

import java.util.ArrayList;
import java.util.List;

public class VowelRemoval {

    /*Method to remove vowels*/
    public List<String> vowelRemoval(String[] countries) {
        List<String> country = new ArrayList<>();
        String name="";
        for (int i=0;i<countries.length;i++) {
            name="";

            //Checks for vowel characters and eliminates them
            for(char c:countries[i].toCharArray()) {
                if(Character.isLetter(c)) {
                    if(!(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')) {
                        name = name+c;
                    }
                }
                else {
                    name = name +c;
                }
            }
            country.add(name);
        }
        return country;
    }
}
