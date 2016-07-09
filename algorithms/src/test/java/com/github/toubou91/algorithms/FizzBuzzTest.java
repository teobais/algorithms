package com.github.toubou91.algorithms;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before 
    public void setUp() {
      fizzBuzz = new FizzBuzz();
    }
    
    @Test
    public void getFizzBuzzForFive() {
        Assert.assertEquals("Buzz", fizzBuzz.getFizzBuzz(5));
    }
}
