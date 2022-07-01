package operations;

public class Subtraction implements ArithmeticOparation {

    @Override
    public double doOperation(double firstParam, double secondParam) {
        return firstParam - secondParam;
    }
}
