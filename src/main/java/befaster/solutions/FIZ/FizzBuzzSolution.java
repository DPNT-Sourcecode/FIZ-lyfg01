package befaster.solutions.FIZ;

import static java.lang.String.valueOf;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        StringBuilder sb = new StringBuilder();

        if (isDeluxe(number) && isOdd(number)) {
            return "fake deluxe";
        }
        if ((number % 3 == 0) || (valueOf(number).contains("3"))) {
            sb.append("fizz");
            sb.append(" ");
        }
        if ((number % 5 == 0) || (valueOf(number).contains("5"))) {
            sb.append("buzz");
            sb.append(" ");
        }
        if (isDeluxe(number)) {
            sb.append("deluxe");
            sb.append(" ");
        }
        if (sb.toString().isEmpty()) {
            return valueOf(number);
        }
        return sb.toString().trim();
    }


    private boolean isDeluxe(int number) {
        if ((number % 5 == 0) && (valueOf(number).contains("5"))) {
            return true;
        }
        if ((number % 3 == 0) && (valueOf(number).contains("3"))) {
            return true;
        }
        return false;
    }

    private boolean isOdd(int number) {
        return number % 2 != 0;
    }


}