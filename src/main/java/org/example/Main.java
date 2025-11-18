package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введіть перше число: ");
            double firstNumber = Double.parseDouble(scanner.nextLine());

            System.out.print("Введіть друге число: ");
            double secondNumber = Double.parseDouble(scanner.nextLine());

            System.out.print("Виберіть одну з операцій +, -, *, /, sqrt: ");
            String operation = scanner.nextLine();

            processOperation(operation, firstNumber, secondNumber);
        } catch (NumberFormatException exception) {
            System.out.println("Введене значення не є числом.");
        } catch (InvalidInputException exception) {
            System.out.println("Вхідні дані невалідні: " + exception.getMessage());
        } catch (ArithmeticException exception) {
            System.out.println("Арифметична помилка: " + exception.getMessage());
        } catch (Exception exception) {
            System.out.println("Помилка: " + exception.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void processOperation(String operation, double a, double b) throws ArithmeticException, InvalidInputException
    {
        double result;
        switch (operation) {
            case "+":
                result = Calculator.add(a, b);
                System.out.println("Результат: " + result);
                break;
            case "-":
                result = Calculator.subtract(a, b);
                System.out.println("Результат: " + result);
                break;
            case "*":
                result = Calculator.multiply(a, b);
                System.out.println("Результат: " + result);
                break;
            case "/":
                result = Calculator.divide(a, b);
                System.out.println("Результат: " + result);
                break;
            case "sqrt":
                result = Calculator.sqrt(a);
                System.out.println("Корінь квадратний з " + a + " = " + result);
                break;
            default:
                System.out.println("Неправильна операція.");
        }
    }
}