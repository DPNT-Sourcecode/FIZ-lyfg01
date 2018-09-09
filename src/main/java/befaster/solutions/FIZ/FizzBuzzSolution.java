package befaster.solutions.FIZ;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.valueOf;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        StringBuilder sb = new StringBuilder();

        if ((number % 3 == 0) || (valueOf(number).contains("3"))) {
            sb.append("fizz");
            sb.append(" ");
        }
        if ((number % 5 == 0) || (valueOf(number).contains("5"))) {
            sb.append("buzz");
            sb.append(" ");
        }
        if ((number % 3 == 0) && (valueOf(number).contains("3")) ||
                (number % 5 == 0) && (valueOf(number).contains("5"))
        ) {
            if (number % 2 != 0) {
                sb.append("fake");
                sb.append(" ");
            }
            sb.append("deluxe");
            sb.append(" ");
        }

        if (sb.toString().isEmpty()) {
            return valueOf(number);
        }

        return sb.toString().trim();
    }


}
