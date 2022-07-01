package operations;

public class Addition implements ArithmeticOparation {

    @Override
    public double doOperation(double firstParam, double secondParam) {
        return firstParam + secondParam;
    }
}
