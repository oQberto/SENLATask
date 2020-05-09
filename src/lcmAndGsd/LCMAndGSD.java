/*
Создать программу, которая будет вычислять и выводить на экран НОК (наименьшее общее кратное)
и НОД (наибольший общий делитель) двух целых чисел, введенных пользователем.
Если пользователь некорректно введёт хотя бы одно из чисел, то сообщать об ошибке.
 */
package lcmAndGsd;

import java.io.*;
import java.util.Arrays;

public class LCMAndGSD {
    private int firstNum;
    private int secondNum;

    private String userInputLine;
    private String youWant;

    public void decision() throws IOException {
        try {
            System.out.println("What do you want lcm or gcd?");
            userInput();

            if (youWant.equals("lcm")) {
                System.out.println(lcm(firstNum, secondNum));
            } else if (youWant.equals("gcd")) {
                System.out.println(gcd(firstNum, secondNum));
            }

        } catch (NumberFormatException e) {
            System.out.println(errorMessage());
        }
    }

    private int gcd(int firstNum, int secondNum) {
        return secondNum == 0 ? firstNum : gcd(secondNum, firstNum % secondNum);
    }

    private int lcm(int firstNum, int secondNum) {
        return firstNum / gcd(firstNum, secondNum) * secondNum;
    }

    private String errorMessage() {
        return "Incorrect input of a number. Enter an integer";
    }

    private void userInput() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        youWant = reader.readLine();
        System.out.println("Write to integers.");
        userInputLine = reader.readLine();
        int[] userInput = Arrays.stream(userInputLine.split(" ")).mapToInt(Integer::parseInt).toArray();
        firstNum = userInput[0];
        secondNum = userInput[1];
    }
}
