import com.sun.tools.jconsole.JConsoleContext;

import java.io.Console;

public class ExerciseSet04 {
    public static void main(String[] args) {
        int answer = Terminal.readInt("Which part of the assigment?");
        if (answer == 1) {
            startByteOverflowDemo();
        } else if (answer == 2) {
            demonstrateArithmeticOperations();
        } else if (answer == 3) {
            convertToBinary();
        } else if (answer == 4) {
            convertHexToDec0();
        }
    }
    public static void startByteOverflowDemo() { //Aufgabe 1
        byte num = 0;
        int i = 0;
        while (i < 10) {
            System.out.print(num + " ");
            num+=30;
            i++;
        }
        System.out.println();
    }
    public static void demonstrateArithmeticOperations () {
        int firstNum = Terminal.readInt("First Operand?");
        int secondNum = Terminal.readInt("Second Operand?");

        int sum = firstNum + secondNum;
        System.out.println(firstNum + " + " + secondNum + " = " + sum);

        int diff = firstNum - secondNum;
        System.out.println(firstNum + " - " + secondNum + " = " + diff);

        int prod = firstNum * secondNum;
        System.out.println(firstNum + " * " + secondNum + " = " + prod);

        int quot = firstNum / secondNum;
        System.out.println(firstNum + " / " + secondNum + " = " + quot);

        int rest = firstNum % secondNum;
        System.out.println(firstNum + " % " + secondNum + " = " + rest);
    }
    public static void convertToBinary() {
        int decNum = Terminal.readInt("decimal Number?");
        int e;
        int binNum;
        System.out.println("Binary Number (from bottom to top):");
        if (decNum == 1) {
            System.out.println(1);
        }else {
            do {
                e = decNum % 2;
                if (e == 0) {
                    System.out.println(0);
                } else {
                    System.out.println(1);
                }
                decNum = decNum / 2;
            } while (decNum / 2 != 0);
            System.out.println(1);
        }
    }
    public static void convertHexToDec0() {
        System.out.print("Please provide a hexadecimal number (e.g. 1f): ");
        int result = 0;
        char ch = Terminal.readChar();
        while (ch != '\n') {
            int code = ch;
            System.out.println(ch + " -> " + code);
            ch = Terminal.readChar();
        }
        convertToNumber(ch);
        System.out.println("Corresponding decimal number: " + result);
    }
    public static int convertToNumber(char ch) {
        int result = 0;
        return result;
    }
}