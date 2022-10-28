/*
18. Sum Calculator
Write a class with the name SimpleCalculator. The class needs two fields (instance variables) with
names firstNumber and secondNumber both of type double.
*/
public class SimpleCalculator {

    double firstNumber, secondNumber;

    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public double setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
        return firstNumber;
    }

    public double setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
        return secondNumber;
    }

    public double getAddtionResult() {
        return firstNumber + secondNumber;
    }

    public double getSubtractionResult() {
        return firstNumber - secondNumber;
    }

    public double getMutiplicationResult() {
        return firstNumber * secondNumber;
    }

    public double getDivisionResult() {

        if (secondNumber == 0) {
            return 0;
        }
        return firstNumber / secondNumber;
    }

    public static void main(String[] args) {

        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAddtionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMutiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
    }
}
