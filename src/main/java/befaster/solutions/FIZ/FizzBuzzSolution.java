package befaster.solutions.FIZ;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.valueOf;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {

        boolean isFizz = false;
        boolean isBuzz = false;
        boolean isDeluxe = false;

        if ((number % 3 == 0) || (valueOf(number).contains("3"))) {
            isFizz = true;
        }
        if ((number % 5 == 0) || (valueOf(number).contains("5"))) {
            isBuzz = true;
        }
        if ((number > 10) && containsIdenticalDigits(number)) {
            isDeluxe = true;
        }

        if (isBuzz && isFizz || (number % 15 == 0)) {
            return "fizz buzz";
        } else if (isBuzz && isFizz && isDeluxe) {
            return "fizz buzz deluxe";
        } else if (isBuzz) {
            return "buzz";
        } else if (isFizz) {
            return "fizz";
        } else if (isDeluxe) {
            return "deluxe";
        }
        return valueOf(number);
    }

    private boolean containsIdenticalDigits(Integer number) {

        List<Integer> digits = new ArrayList<>();

        while (number > 0) {
            digits.add(number % 10);
            number = number / 10;
        }

        return digits.stream().allMatch(digits.get(0)::equals);


    }

}