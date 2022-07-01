package console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputConsole {

    public static Scanner scanner = new Scanner(System.in);

    public static double getDoubleFromConsole() throws IOException {
        double result = 0.0;
        do {
            String value = scanner.next();
            if (value.matches("\\d+(.\\d+)?")){
                result = Double.parseDouble(value);
                break;
            }else {
                OutputConsole.writeToConsole("Введенное значение не является числом. Повторите ввод.");
            }
        }while(true);
        return result;
    }

    public static String getTextFromConsole() throws IOException {
        return scanner.next();
    }
}
