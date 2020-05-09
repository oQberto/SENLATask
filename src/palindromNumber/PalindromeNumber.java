/*
Создать программу, которая в последовательности от 0 до N,
находит все числа-палиндромы (зеркальное значение равно оригинальному).
Длина последовательности N вводится вручную и не должна превышать 100.
 */
package palindromNumber;

import java.io.*;

public class PalindromeNumber {
    private final int MIN_VALUE = 0;
    private final int MAX_VALUE = 100;

    private int sequenceLength;

    public void decision() throws IOException {
        userInput();
        if (!(sequenceLength < MIN_VALUE || sequenceLength > MAX_VALUE)) {
            for (int i = MIN_VALUE; i < sequenceLength + 1; i++) {
                if (isPalindrome(i)) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("The length of the sequence must be in the range from 0 to 100.");
        }
    }

    private boolean isPalindrome(int inputNumber) {
        int next = 0;
        int temp = inputNumber;

        while (temp != 0) {
            next = (next * 10) + (temp % 10);
            temp /= 10;
        }
        return inputNumber == next;
    }

    private void userInput() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        sequenceLength = Integer.parseInt(reader.readLine());
    }
}
