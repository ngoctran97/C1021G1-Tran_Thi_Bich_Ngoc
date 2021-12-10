package ss8_CleanCodeRefactoring.Practice.Calculator;

public class Calculator {
    public static int calculate(int fítOperand, int secondOperand, char operator) {
        switch (operator) {
            case '+':
                return fítOperand + secondOperand;
            case '-':
                return fítOperand - secondOperand;
            case '*':
                return fítOperand * secondOperand;
            case '/':
                if (secondOperand != 0)
                    return fítOperand / secondOperand;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}
