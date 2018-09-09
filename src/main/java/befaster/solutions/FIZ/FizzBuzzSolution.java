package befaster.solutions.FIZ;

import static java.lang.String.valueOf;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {

        boolean isFizz = false;
        boolean isBuzz = false;

        if ((number % 3 == 0) || (valueOf(number).contains("3"))) {
            isFizz = true;
        }
        if ((number % 5 == 0) || (valueOf(number).contains("5"))) {
            isBuzz = true;
        }

        if (isBuzz && isFizz || (number % 15 == 0)) {
            return "fizz buzz";
        } else if (isBuzz) {
            return "buzz";
        } else if (isFizz) {
            return "fizz";
        }
        return valueOf(number);
    }

}
