package befaster.solutions.FIZ;

import static java.lang.String.valueOf;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        StringBuilder sb = new StringBuilder();
        boolean isDeluxe = false;

        if ((number % 3 == 0) || (valueOf(number).contains("3"))) {
            sb.append("fizz");
            sb.append(" ");
        }
        if ((number % 5 == 0) || (valueOf(number).contains("5"))) {
            sb.append("buzz");
            sb.append(" ");
        }
        if ((number % 3 == 0) && (valueOf(number).contains("3"))) {
            isDeluxe = true;
            if (number % 2 != 0) {
                return "fake deluxe";
            }
            return "fizz deluxe";
        }
        if ((number % 5 == 0) && (valueOf(number).contains("5"))) {

            isDeluxe = true;
            if (number % 2 != 0) {
                return "fake deluxe";
            }
            return "buzz deluxe";
        }

        if (sb.toString().isEmpty()) {
            return valueOf(number);
        }
        else if (sb.toString().contains("fizz buzz") && isDeluxe) {
            return "fizz buzz deluxe";
        }

        return sb.toString().trim();
    }


}
