package com.github.toubou91.algorithms;

/**
 * 
 * https://github.com/EnterpriseQualityCoding/FizzBuzzEnterpriseEdition
 * @author Thodoris
 *
 */
public class FizzBuzz {

    public String getFizzBuzz(int number) {
        String output = "";

        if (number % 3 == 0 && number % 5 == 0) {
            output += "FizzBuzz";
        } else if (number % 3 == 0) {
            output += "Fizz";
        } else if (number % 5 == 0) {
            output += "Buzz";
        } else {
            output += number;
        }

        return output;
    }
}
