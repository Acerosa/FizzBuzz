package rr.com;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static rr.com.FizzBuzz.fizzBuzz;

import org.hamcrest.Matcher;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @Test
    @DisplayName("Test for matcher")
    public void testForMatcher(){
        testMatcher(1, is("1"));
        testMatcher(2, is("2"));
        testMatcher(56, is("56"));
    }

    @Test
    @DisplayName("Return the number")
    public void shouldReturnNumber()
    {

       Assertions.assertEquals("1", fizzBuzz(1));
       Assertions.assertEquals("2", fizzBuzz(2));
       Assertions.assertEquals("56", fizzBuzz(56));
    }

    @Test
    @DisplayName("Return Buzz for 3")
    public void shouldReturnBuzz()
    {
        Assertions.assertEquals("Buzz", fizzBuzz(3));
    }

    @Test
    @DisplayName("Return Buzz 18")
    public void shouldReturnBuzz18()
    {
        Assertions.assertEquals("Buzz", fizzBuzz(18));
    }

    @Test
    @DisplayName("Return Fizz")
    public void shouldReturnFizz()
    {
        Assertions.assertEquals("Fizz", fizzBuzz(5));
    }
    @Test
    @DisplayName("Return Fizz")
    public void shouldReturnFizz20()
    {
        Assertions.assertEquals("Fizz", fizzBuzz(5));
    }

    @Test(expected=IllegalArgumentException.class)
    @DisplayName("Return Exception")
    public void shouldThrowException()
    {
       fizzBuzz(0);
    }

    @Test(expected=IllegalArgumentException.class)
    @DisplayName("Return Exception")
    public void shouldThrowExceptionFor()
    {
        fizzBuzz(-10);
    }

    @Test
    @DisplayName("Return Fizz")
    public void shouldReturn15FizzBuzz()
    {
        Assertions.assertEquals("fizzBuzz", fizzBuzz(15));
    }
    @Test
    @DisplayName("Return fizzBuzz")
    public void shouldReturn30FizzBuzz()
    {
        Assertions.assertEquals("fizzBuzz", fizzBuzz(30));
    }


    public void testMatcher(int n, Matcher<String> matcher)
    {
        assertThat(fizzBuzz(n), matcher);
    }
}
