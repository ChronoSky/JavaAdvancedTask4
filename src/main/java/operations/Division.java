package operations;

public class Division implements ArithmeticOparation {

    @Override
    public double doOperation(double firstParam, double secondParam) {
        if (secondParam==0) throw new ArithmeticException("Делить не ноль нельзя");
        return firstParam / secondParam;
    }

}