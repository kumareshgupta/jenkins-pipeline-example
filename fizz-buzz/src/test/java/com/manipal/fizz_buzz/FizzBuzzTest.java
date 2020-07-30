package com.manipal.fizz_buzz;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

    public FizzBuzz fB;

    @Before
    public void setUp() {
        fB = new FizzBuzz();
    }

    @Test
    public void testNumber() {
        String fizzBuzz = fB.play(1);
        assertEquals(fizzBuzz, "1");
    }

    @Test
    public void testFizz() {
        String fizzBuzz = fB.play(3);
        assertEquals(fizzBuzz, "Fizz");
    }

    @Test
    public void testBuzz() {
        String fizzBuzz = fB.play(5);
        assertEquals(fizzBuzz, "Buzz");
    }

    @Test
    public void testZero() {

        assertThrows(IllegalArgumentException.class,
                () -> fB.play(0));
    }

    @After
    public void tearDown() {
        fB = null;
    }


}
