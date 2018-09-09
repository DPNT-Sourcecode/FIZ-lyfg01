package befaster.solutions.FIZ;

import static java.lang.String.valueOf;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        if (number % 15 == 0) {
            return "fizz buzz";
        } else if ((number % 3 == 0) || (valueOf(number).contains("3"))) {
            return "fizz";
        } else if ((number % 5 == 0) || (valueOf(number).contains("5"))) {
            return "buzz";
        }
        return valueOf(number);

    }

}
