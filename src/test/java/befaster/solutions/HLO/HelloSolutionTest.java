package befaster.solutions.HLO;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloSolutionTest {

    private HelloSolution helloSolution;

    @Before
    public void setUp() throws Exception {
        helloSolution = new HelloSolution();
    }

    @Test
    public void shouldReturnHelloPaul() {
        String result = helloSolution.hello("Paul");
        assertEquals(result, "Hello, Paul!");

    }
}