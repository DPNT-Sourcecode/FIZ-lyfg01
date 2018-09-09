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
        String result = fizzBuzzSolution.fizzBuzz(6);
        assertEquals(result, "fizz");
    }

    @Test
    public void shouldReturnBuzzIfMultipleOfFive() {
        String result = fizzBuzzSolution.fizzBuzz(10);
        assertEquals(result, "buzz");
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
    public void shouldReturnFakeDeluxeIfDivisibleBy3AndHas3InItAndIsOdd() {
        assertEquals("fizz fake deluxe", fizzBuzzSolution.fizzBuzz(33));
    }

    @Test
    public void shouldReturnFizzDeluxeIfDivisibleBy3AndHas3InIt() {
        assertEquals("fizz buzz deluxe", fizzBuzzSolution.fizzBuzz(30));
    }

    @Test
    public void shouldReturnBuzzDeluxeIfDivisibleBy5AndHas5InIt() {
        assertEquals("buzz deluxe", fizzBuzzSolution.fizzBuzz(50));
    }

    @Test
    public void shouldReturnFakeDeluxeIfDeluxeIsOdd() {
        assertEquals("buzz fake deluxe", fizzBuzzSolution.fizzBuzz(55));
    }

    @Test
    public void shouldReturnFizzFakeDeluxeIfDeluxeIsOdd() {
        assertEquals("fizz fake deluxe", fizzBuzzSolution.fizzBuzz(3));
    }


}
