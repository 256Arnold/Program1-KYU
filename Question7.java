import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        double first_number;
        double second_number;
        BigDecimal result = null;
        Scanner number1 = new Scanner(System.in);
        System.out.println("Enter the first decimal number");
        while (true) {
            if (number1.hasNextDouble()) {
                first_number = number1.nextDouble();
                break;
            } else {
                System.out.println("Invalid number. Please input a valid number");
            }
            main(null);
        }
        System.out.println("Enter the second decimal number");
        while (true) {
            if (number1.hasNextDouble()) {
                second_number = number1.nextDouble();
                break;
            } else {
                System.out.println("Invalid number. Please input a valid number");
            }
            main(null);
        }
        Scanner operator = new Scanner(System.in);
        System.out.println("Enter operation of your choice (+,-,*,/)");
        String operation = operator.nextLine();
        BigDecimal number_1 = BigDecimal.valueOf(first_number);
        BigDecimal number_2 = BigDecimal.valueOf(second_number);
        switch (operation) {
            case "+" -> {
                result = number_1.add(number_2);
                System.out.println(result);
            }
            case "-" -> {
                number_1 = number_1.subtract(number_2);
                System.out.println(number_1);
            }
            case "*" -> {
                result = number_1.multiply(number_2);
                System.out.println(result);
            }
            case "/" -> {
                result = number_1.divide(number_2, RoundingMode.HALF_EVEN);
                System.out.println(result);
            }
            default -> {
                System.out.println("Wrong input");
                main(null);
            }
        }
        MathContext mc = new MathContext(2);
        assert result != null;
        System.out.println(result.sqrt(mc));
        //power of 2
        System.out.println(result.pow(2));
    }
}