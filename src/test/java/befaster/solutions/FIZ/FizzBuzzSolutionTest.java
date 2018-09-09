package befaster.solutions.FIZ;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzSolutionTest {

    private FizzBuzzSolution fizzBuzzSolution;

    @Before
    public void setUp() throws Exception {

        fizzBuzzSolution = new FizzBuzzSolution();
    }

    @Test
    public void shouldReturnFizzIfMultipleOfThree() {
        String result = fizzBuzzSolution.fizzBuzz(3);
        assertEquals(result, "fizz");
    }

    @Test
    public void shouldReturnBuzzIfMultipleOfFive() {
        String result = fizzBuzzSolution.fizzBuzz(25);
        assertEquals(result, "buzz");
    }

    @Test
    public void shouldReturnFizzBuzzIfMultipleOfThreeAndFive() {
        String result = fizzBuzzSolution.fizzBuzz(45);
        assertEquals(result, "fizz buzz");
    }

    @Test
    public void shouldReturnNumber() {
        String result = fizzBuzzSolution.fizzBuzz(46);
        assertEquals(result, "46");
    }


    @Test
    public void shouldReturnFizzIfContains3InNumber() {
        assertEquals("fizz", fizzBuzzSolution.fizzBuzz(13));
    }

    @Test
    public void shouldReturnFizzIfContains5InNumber() {
        assertEquals("buzz deluxe", fizzBuzzSolution.fizzBuzz(55));
    }

    @Test
    public void shouldReturnFizzBuzzIfContainsBoth3And5InNumber() {
        assertEquals("fizz buzz", fizzBuzzSolution.fizzBuzz(35));
    }


    @Test
    public void shouldReturnDeluxeIfGreaterThan10AndIncludesAllIdenticalDigits() {
        assertEquals("deluxe", fizzBuzzSolution.fizzBuzz(1111));
    }

    @Test
    public void shouldReturnFizzBuzzDeluxe() {
        assertEquals("fizz deluxe", fizzBuzzSolution.fizzBuzz(33));
    }
}
