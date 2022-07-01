public class Program {

    public static void main(String[] args) throws Exception {
        Calculator calc = new Calculator();
        calc.setFirstParam();
        calc.setSecondParam();
        calc.setOperation();
        calc.doOperation();

        System.out.println("Результат : " + calc.getResult());
    }

}
