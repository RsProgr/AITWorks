package homework23.calculator;

public class Calculator {

    public int fold(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divideWithRem(int a, int b) {
        if (b == 0) {
            System.out.println("Деление на ноль невозможно");
            return Integer.MIN_VALUE;
        }
        return a % b;
    }

    public int intDivision(int a, int b) {
        if (b == 0) {
            System.out.println("деление на ноль не возможно");
            return Integer.MIN_VALUE;
        }
        return a / b;
    }
}