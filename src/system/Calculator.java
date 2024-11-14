package system;

import java.util.Scanner;

public class Calculator {

    public Scanner scanner = new Scanner(System.in);

    public void numCounter() {
        int x = scanner.nextInt();
        while (true) {

            scanner.nextLine();

            String operator = scanner.nextLine();

            if (ifOperatorIsExit(operator)) break;

            int y = scanner.nextInt();

            x = calculate(operator, x, y);

            System.out.println(x);
        }
    }

    private static boolean ifOperatorIsExit(String operator) {
        if (operator.equalsIgnoreCase("С")) {
            System.out.println(0);
            return true;
        }
        return false;
    }

    private static int calculate(String operator, int x, int y) {
        int result = 0;
        switch (operator) {
            case "+" -> result = x + y;
            case "-" -> result = x - y;
            case "*" -> result = x * y;
            case "/" -> {
                if (y != 0) {
                    result = x / y;
                } else {
                    System.err.println("You can not divide the 0");
                }
            }
            default -> System.err.println("Wrong operator");
        }
        return result;
    }

}
