package operations;

public class Multiplication implements ArithmeticOparation {

    @Override
    public double doOperation(double firstParam, double secondParam) {
        return firstParam * secondParam;
    }
}
