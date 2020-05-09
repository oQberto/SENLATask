/*
Создать программу, которая будет сообщать, является ли целое число,
введенное пользователем, чётным или нечётным, простым или составным.
Если пользователь введёт не целое число, то сообщать ему об ошибке.
 */
package evenOrOdd;

import java.io.*;

public class NumberCheck {
    private int userInput;

    public void decision() throws IOException {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            userInput = Integer.parseInt(reader.readLine());

            evenOrOdd(userInput);
            primeOrCompare(userInput);
        } catch (NumberFormatException e) {
            System.out.println("Incorrect input of a number. Enter an integer");
        }
    }

    private void evenOrOdd(int userInput) {
        if (userInput % 2 == 0) {
            System.out.println(userInput +  " - is even.");
        } else {
            System.out.println(userInput +  " - is odd.");
        }
    }

    private void primeOrCompare(int userInput) {
        int temp;
        boolean isPrime = true;
        for (int i = 2; i <= userInput / 2; i++) {
            temp = userInput % i;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(userInput + " - is prime.");
        } else {
            System.out.println(userInput + " - is not prime.");
        }
    }
}


