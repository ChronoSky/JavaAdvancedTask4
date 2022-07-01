import console.InputConsole;
import console.OutputConsole;
import operations.*;

import java.io.IOException;

public class Calculator {

    private double firstParam;
    private double secondParam;
    private ArithmeticOparation operation;
    private double result;

    public void setFirstParam() throws IOException {
        OutputConsole.writeToConsole("Введите первое число");
        this.firstParam = InputConsole.getDoubleFromConsole();
    }

    public void setSecondParam() throws IOException {
        OutputConsole.writeToConsole("Введите второе число");
        this.secondParam = InputConsole.getDoubleFromConsole();
    }

    public void setOperation() throws IOException {
        String operationSimbol;
        do {
            OutputConsole.writeToConsole("Укажите одну из арифметических операций : + , - , /, * .");
            operationSimbol = InputConsole.getTextFromConsole().trim();
        }while (!(operationSimbol.equals("+") || operationSimbol.equals("-") || operationSimbol.equals("*") || operationSimbol.equals("/")));

        switch (operationSimbol){
            case "+" :
                operation = new Addition();
                break;
            case "-" :
                operation = new Subtraction();
                break;
            case "/" :
                operation = new Division();
                break;
            case "*" :
                operation = new Multiplication();
                break;
        }
    }

    public void doOperation() throws Exception {
        if (operation==null) throw new Exception("Не возможен вывод результата. Не указана операция");
        result = operation.doOperation(this.firstParam, this.secondParam);
    }

    public double getResult() {
        return result;
    }

}
